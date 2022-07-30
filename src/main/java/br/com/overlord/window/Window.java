package br.com.overlord.window;

import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;

import javax.swing.JFrame;

public class Window extends JFrame {

	public Window(String title) {
		this.setTitle(title);
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);
		this.setBounds(0,0,720,360);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		URL caminhoImagem = this.getClass().getResource("ainz.png");
	    Image iconeTitulo = Toolkit.getDefaultToolkit().getImage(caminhoImagem);
	    setIconImage(iconeTitulo);
		
		this.add(WindowConfig.generateSPA());
		
		this.setUndecorated(false);
		this.setVisible(true);
	}
}