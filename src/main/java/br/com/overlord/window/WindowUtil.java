package br.com.overlord.window;

import java.awt.Dimension;
import java.awt.Toolkit;

public class WindowUtil {
	
	public static Dimension getDimension() {
		return Toolkit.getDefaultToolkit().getScreenSize();
	}
}