package br.com.overlord.gui.login;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;

import br.com.overlord.gui.config.Panel;
import br.com.overlord.gui.main.MainPanel;
import br.com.overlord.window.WindowConfig;

public class LoginPanel extends Panel implements ActionListener {
	
	public static final String NAME_PAGE = "Enter";
	
	public LoginPanel() {
		super();
		
		JButton button = new JButton("Enter");
		button.addActionListener(this);
		this.add(button);
	}

	@Override
	public void actionPerformed(ActionEvent event) {
		WindowConfig.alterScreen(MainPanel.NAME_PAGE);
	}
}