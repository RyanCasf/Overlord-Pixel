package br.com.overlord.gui.login;

import br.com.overlord.gui.component.button.Button;
import br.com.overlord.gui.config.Panel;

public class LoginPanel extends Panel {
	private static final long serialVersionUID = -4022575312284770310L;
	
	public static final String NAME_PAGE = "Enter";
	
	public LoginPanel() {
		super();
		add(new Button(NAME_PAGE));
	}
}