package org.eclipse.epsilon.emc.caex;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.BasicExtendedMetaData;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceFactoryImpl;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;
import org.eclipse.epsilon.emc.emf.CachedResourceSet;
import org.eclipse.epsilon.emc.emf.EmfModel;
import caex.anytype.AnytypePackage;

public abstract class CaexBaseModel extends EmfModel {
	
	BasicExtendedMetaData bemd;
	
	protected ResourceSet createResourceSet() {
		ResourceSet rs =  new CachedResourceSet();
		
		// Register the required EPackages
		this.registry = rs.getPackageRegistry();
		registerRequiredPackages(this.registry);
		
		// Make sure the ResourceSet uses the correct factory to load the given file by associating the factory with the file extension
		rs.getResourceFactoryRegistry().getExtensionToFactoryMap().put(modelUri.fileExtension(), new XMLResourceFactoryImpl());
		
		setLoadOptions();
		setStoreOptions();
		
		return rs;
	}
	
	protected void registerRequiredPackages(EPackage.Registry registry) {
		// Register all EPackages required to load the CAEX model
		registry.put(EcorePackage.eNS_URI, EcorePackage.eINSTANCE);
		registry.put(XMLTypePackage.eNS_URI, XMLTypePackage.eINSTANCE);
		registry.put(AnytypePackage.eNS_URI, AnytypePackage.eINSTANCE);
	}

	protected void setLoadOptions() {
		putResourceLoadOption(XMLResource.OPTION_EXTENDED_META_DATA, getOrCreateExtendedMetaData());
	}
	
	protected void setStoreOptions() {
		putResourceStoreOption(XMLResource.OPTION_EXTENDED_META_DATA, getOrCreateExtendedMetaData());
	}

	protected Object getOrCreateExtendedMetaData() {
		if (this.bemd == null) {
			// We need to pass a custom ExtendedMetaData implementation to make sure all features are recognized
			// (see https://stackoverflow.com/a/45441670)
			this.bemd = new BasicExtendedMetaData(registry) {
				@Override
				protected boolean isFeatureNamespaceMatchingLax() {
					return true;
				}
				
			};
		}
		return this.bemd;
	}
}
