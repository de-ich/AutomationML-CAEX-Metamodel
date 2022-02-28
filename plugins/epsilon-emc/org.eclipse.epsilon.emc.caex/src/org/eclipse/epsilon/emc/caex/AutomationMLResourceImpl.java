package org.eclipse.epsilon.emc.caex;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import org.apache.poi.openxml4j.opc.OPCPackage;
import org.apache.poi.openxml4j.opc.PackagePart;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceImpl;

public class AutomationMLResourceImpl extends XMLResourceImpl {

	public AutomationMLResourceImpl() {
		super();
	}
	
	public AutomationMLResourceImpl(URI uri) {
		super(uri);
	}
	
	@Override
	public void doLoad(InputStream inputStream, Map<?, ?> options) throws IOException {
		
		byte[] content = inputStream.readAllBytes();
		
		try {
			super.doLoad(new ByteArrayInputStream(content), options);
		} catch (Exception e) {
			
			// if loading fails, this is probably because the file is not a simple AML file but an AML container package
			this.getErrors().clear();
			loadContainerPackage(new ByteArrayInputStream(content), options);			
		}
	}

	public void loadContainerPackage(InputStream inputStream, Map<?, ?> options) throws IOException {
		
		OPCPackage p;
		try {
			p = OPCPackage.open(inputStream);
			
		} catch (Exception e) {
			throw new IOException("File is not a valid Open Packaging Container file!", e);
		}
		
		PackagePart root;
		try {
			root = p.getPartsByRelationshipType("http://schemas.automationml.org/container/relationship/RootDocument").get(0);
		} catch (Exception e) {
			throw new IOException("File does not contain an AutomationML root document!", e);
		}

		super.doLoad(root.getInputStream(), options);
	}
	
	
}
