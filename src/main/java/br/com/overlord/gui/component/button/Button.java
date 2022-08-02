package br.com.overlord.gui.component.button;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import br.com.overlord.gui.main.MainPanel;
import br.com.overlord.window.WindowConfig;
import br.com.overlord.window.WindowUtil;

public class Button extends JButton implements ActionListener {

	public Button(String title) {
		super(title);
		addActionListener(this);
		setFocusPainted(false);
		setBorderPainted(false);
		setBackground(Color.decode("#6d5dd3"));
		setForeground(Color.WHITE);
		
		setBounds(
				((WindowUtil.getDimension().width - 50) / 2),
				((WindowUtil.getDimension().height - 15) / 2),
				100,
				30
		);
	}
	
	@Override
	public void actionPerformed(ActionEvent event) {
		WindowConfig.alterScreen(MainPanel.NAME_PAGE);
	}
}