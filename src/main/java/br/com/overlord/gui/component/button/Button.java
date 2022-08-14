package br.com.overlord.gui.component.button;

import java.awt.Color;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import br.com.overlord.window.WindowUtil;

public class Button extends JButton {

	private static final long serialVersionUID = 1L;

	public Button(String title, ActionListener actionListener) {
		super(title);
		addActionListener(actionListener);
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
}