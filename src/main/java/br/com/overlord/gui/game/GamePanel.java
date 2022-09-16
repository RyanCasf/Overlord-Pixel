package br.com.overlord.gui.game;

import br.com.overlord.gui.component.Panel;
import br.com.overlord.window.WindowUtil;

import java.awt.Color;
import java.awt.Graphics;

public class GamePanel extends Panel {
	private static final long serialVersionUID = -2165762423550088479L;
	public static final String NAME_PAGE = "Game Page";
	
	public GamePanel() {
		super();
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		int renderX = (WindowUtil.getDimension().width - 200) / 2 ;
		int renderY = (WindowUtil.getDimension().height - 50) / 2;
		
		g.fillRect(renderX, renderY, 200, 50);
		g.setColor(Color.decode("#ff0000"));
		g.drawOval(renderX, (renderY + 50), 200, 0);
	}
}