package org.eclipse.epsilon.emc.caex;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage.Registry;
import org.eclipse.epsilon.common.util.StringProperties;
import org.eclipse.epsilon.eol.exceptions.models.EolModelLoadingException;
import org.eclipse.epsilon.eol.models.IRelativePathResolver;

import caex.caex30.caex.impl.CAEXPackageImpl;

public class Caex30Model extends CaexBaseModel {
	
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
	
}
