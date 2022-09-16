package br.com.overlord.input;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyboardInput implements KeyListener {

	@Override
	public void keyTyped(KeyEvent e) {
		System.out.println("keyTyped");
	}

	@Override
	public void keyReleased(KeyEvent e) {
		System.out.println("keyReleased");
	}
	
	@Override
	public void keyPressed(KeyEvent e) {
		System.out.println("keyPressed");
		
		switch (e.getKeyCode()) {
			case KeyEvent.VK_A:
				System.out.println("A");
				break;
				
			case KeyEvent.VK_S:
				System.out.println("S");
				break;
			
			case KeyEvent.VK_D:
				System.out.println("D");
				break;
				
			case KeyEvent.VK_W:
				System.out.println("W");
				break;
		}
	}
}