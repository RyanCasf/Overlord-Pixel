package br.com.overlord.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import br.com.overlord.window.WindowConfig;

public class LoginPanel extends JPanel implements ActionListener {
	
	public static final String NAME_PAGE = "Enter";
	
	public LoginPanel() {
		JLabel message = new JLabel("Login");
		this.add(message);
		
		JButton button = new JButton("Enter");
		button.addActionListener(this);
		this.add(button);
	}

	@Override
	public void actionPerformed(ActionEvent event) {
		WindowConfig.alterScreen(MainPanel.NAME_PAGE);
	}
}