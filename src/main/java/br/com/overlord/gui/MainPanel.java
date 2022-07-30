package br.com.overlord.gui;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainPanel extends JPanel implements ActionListener {
	
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