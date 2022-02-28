package org.eclipse.epsilon.emc.caex;

import org.eclipse.emf.ecore.resource.ResourceSet;

public class AutomationML1Model extends Caex215Model {
	
	protected ResourceSet createResourceSet() {
		
		ResourceSet rs = super.createResourceSet();
		
		// Make sure the ResourceSet uses the correct factory to load the given file by associating the factory with the file extension
		rs.getResourceFactoryRegistry().getExtensionToFactoryMap().put(modelUri.fileExtension(), new AutomationMLResourceFactoryImpl());
		
		return rs;
	
	}	

}
