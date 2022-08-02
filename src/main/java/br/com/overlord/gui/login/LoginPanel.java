package br.com.overlord.gui.login;

import javax.swing.JTextField;

import br.com.overlord.gui.component.button.Button;
import br.com.overlord.gui.config.Panel;

public class LoginPanel extends Panel {
	
	public static final String NAME_PAGE = "Enter";
	
	public LoginPanel() {
		super();
		
		JTextField login = new JTextField();
		login.setBounds(0,0,180,30);
		add(login);
		
		JTextField psw = new JTextField();
		psw.setBounds(0,0,180,30);
		add(psw);
		
		Button button = new Button("Enter");
		add(button);
	}
}