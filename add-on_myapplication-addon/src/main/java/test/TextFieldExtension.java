package test;

import com.vaadin.server.AbstractExtension;
import com.vaadin.ui.TextField;

public class TextFieldExtension extends AbstractExtension {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public TextFieldExtension(TextField field) {
		super.extend(field);
		TextFieldExtensionServerRpc rpc = this::handleEnterKeyPressed;
		registerRpc(rpc);
	}

	private void handleEnterKeyPressed() {
		System.out.println("ENTER KEY PRESSED");
	}
}
