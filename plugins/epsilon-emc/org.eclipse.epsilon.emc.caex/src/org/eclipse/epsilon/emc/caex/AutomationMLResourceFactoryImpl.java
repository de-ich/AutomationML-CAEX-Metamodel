package org.eclipse.epsilon.emc.caex;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceFactoryImpl;

public class AutomationMLResourceFactoryImpl extends XMLResourceFactoryImpl {

	@Override
	public Resource createResource(URI uri) {
		return new AutomationMLResourceImpl(uri);
	}
	
}
