package org.eclipse.epsilon.emc.caex.dt;

import org.eclipse.epsilon.common.dt.launching.dialogs.AbstractCachedModelConfigurationDialog;
import org.eclipse.epsilon.emc.emf.EmfModel;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

public abstract class CaexModelConfigurationDialog extends AbstractCachedModelConfigurationDialog {
	
	protected Label fileTextLabel;
	protected Text fileText;
	protected Button browseModelFile;
	
	@Override
	protected void createGroups(Composite control) {
		super.createGroups(control);
		createFilesGroup(control);
		createLoadStoreOptionsGroup(control);
	}
	
	protected Composite createFilesGroup(Composite parent) {
		final Composite groupContent = createGroupContainer(parent, "Files/URIs", 3);
		
		fileTextLabel = new Label(groupContent, SWT.NONE);
		fileTextLabel.setEnabled(true);
		fileTextLabel.setText("File: ");
		
		fileText = new Text(groupContent, SWT.BORDER);
		fileText.setEnabled(true);
		fileText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		
		browseModelFile = new Button(groupContent, SWT.NONE);
		browseModelFile.setText("Browse Workspace...");
		browseModelFile.addListener(SWT.Selection, new BrowseWorkspaceForModelsListener(fileText, "XML Documents in the workspace", "Select an XML document"));
		
		groupContent.layout();
		groupContent.pack();
		return groupContent;
	}

	
	
	@Override
	protected void loadProperties() {
		super.loadProperties();
		if (properties == null) return;
		fileText.setText(properties.getProperty(EmfModel.PROPERTY_MODEL_URI));
	}
	
	
	@Override
	protected void storeProperties() {
		super.storeProperties();
		properties.put(EmfModel.PROPERTY_MODEL_URI, fileText.getText());
	}
}