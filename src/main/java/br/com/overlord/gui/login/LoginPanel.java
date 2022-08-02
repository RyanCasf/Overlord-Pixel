package br.com.overlord.gui.login;

import br.com.overlord.gui.component.button.Button;
import br.com.overlord.gui.config.Panel;

public class LoginPanel extends Panel {
	
	public static final String NAME_PAGE = "Enter";
	
	public LoginPanel() {
		super();
		add(new Button("Enter"));
	}
}