package org.eclipse.epsilon.emc.caex;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EPackage.Registry;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.epsilon.common.util.StringProperties;
import org.eclipse.epsilon.eol.exceptions.models.EolModelLoadingException;
import org.eclipse.epsilon.eol.models.IRelativePathResolver;

import caex.caex215.caex.CAEXObject;
import caex.caex215.caex.impl.CAEXPackageImpl;

public class Caex215Model extends CaexBaseModel {
	
	/**
	 * Load the model using the set of properties specified by the first argument.
	 * 
	 * @see #PROPERTY_MODEL_URI
	 * @see #PROPERTY_EXPAND
	 * @see <a href="https://bugs.eclipse.org/bugs/show_bug.cgi?id=341481">Rationale for deprecating the FILE properties</a>.
	 */
	@Override
	public void load(StringProperties properties, IRelativePathResolver resolver) throws EolModelLoadingException {
			
		super.load(properties, resolver);		
		this.metamodelUris.add(URI.createURI(CAEXPackageImpl.eNS_URI));
	}
	
	@Override
	protected void registerRequiredPackages(Registry registry) {
		super.registerRequiredPackages(registry);
		registry.put(CAEXPackageImpl.eNS_URI, CAEXPackageImpl.eINSTANCE);
	}
	
	@Override
	protected void setLoadOptions() {
		super.setLoadOptions();
		
		// As CAEX 2.15 files do not specify a namespace, we need a custom MissingPackageHandler to make sure the CAEX package is used for 
		// the default namespace (see https://stackoverflow.com/a/45441670)
		XMLResource.MissingPackageHandler mph = new XMLResource.MissingPackageHandler() {
			@Override
			public EPackage getPackage(final String nsURI) {
				return CAEXPackageImpl.eINSTANCE;
			}
		};
		putResourceLoadOption(XMLResource.OPTION_MISSING_PACKAGE_HANDLER, mph);
	}	
	
	@Override
	public String getElementId(Object instance) {
		if (instance instanceof CAEXObject && ((CAEXObject) instance).getID() != null) {
			return ((CAEXObject) instance).getID();
		}
		
		return super.getElementId(instance);
		
	}
}
