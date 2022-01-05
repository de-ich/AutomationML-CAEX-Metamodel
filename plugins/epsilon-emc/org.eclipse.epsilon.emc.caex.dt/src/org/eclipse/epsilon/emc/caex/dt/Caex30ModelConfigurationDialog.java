package org.eclipse.epsilon.emc.caex.dt;

public class Caex30ModelConfigurationDialog extends CaexModelConfigurationDialog {
	
	@Override
	protected String getModelName() {
		return "CAEX 3.0 File";
	}

	@Override
	protected String getModelType() {
		return "CAEX30";
	}
}