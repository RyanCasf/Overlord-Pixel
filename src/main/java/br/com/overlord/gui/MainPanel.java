package br.com.overlord.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class MainPanel extends Panel implements ActionListener {
	
	public static final String NAME_PAGE = "Main Page";
	
	public MainPanel() {
		JLabel message = new JLabel("Main Screen");
		this.add(message);
		
		JButton button = new JButton("Welcome");
		button.addActionListener(this);
		this.add(button);
	}

	@Override
	public void actionPerformed(ActionEvent event) {
		JOptionPane.showMessageDialog(null, "Main");
	}
}