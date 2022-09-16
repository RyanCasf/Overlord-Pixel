package br.com.overlord.gui.game;

import java.awt.Color;
import java.awt.Graphics;

import br.com.overlord.gui.component.Panel;
import br.com.overlord.input.KeyboardInput;
import br.com.overlord.window.WindowUtil;

public class GamePanel extends Panel {
	private static final long serialVersionUID = -2165762423550088479L;
	public static final String NAME_PAGE = "Game Page";
	
	public GamePanel() {
		super();
		
		requestFocus();
		addKeyListener(new KeyboardInput());
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		int renderX = (WindowUtil.getDimension().width - 200) / 2 ;
		int renderY = (WindowUtil.getDimension().height - 50) / 2;
		
		g.fillRect(renderX, renderY, 200, 50);
		g.setColor(Color.decode("#6d5dd3"));
		g.drawOval(renderX, (renderY + 50), 200, 0);
	}
}