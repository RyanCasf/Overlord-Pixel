package br.com.overlord.gui.main;

import br.com.overlord.gui.component.Button;
import br.com.overlord.gui.component.Panel;
import br.com.overlord.gui.game.GamePanel;
import br.com.overlord.window.WindowConfig;

public class MainPanel extends Panel {
	private static final long serialVersionUID = -3049107050106535475L;
	
	public static final String NAME_PAGE = "Main Page";
	
	public MainPanel() {
		super();
		
		add(new Button(
				"Play", e -> WindowConfig.alterScreen(GamePanel.NAME_PAGE)));
	}
}