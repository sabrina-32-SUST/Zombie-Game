package org.graphics;

import com.jogamp.newt.opengl.GLWindow;
import com.jogamp.opengl.GLCapabilities;
import com.jogamp.opengl.GLProfile;

public class render {

	private static GLWindow window = null;
	
	public static void init() {
		GLProfile.initSingleton();
		GLProfile profile = GLProfile.get(GLProfile.GL2);
		GLCapabilities caps = new GLCapabilities(profile);
		
		window = GLWindow.create(caps);
		window.setSize(640, 360);
		window.setResizable(false);
		
		window.setVisible(true);
		
	}
	
	public static void main(String[] orgs) {
		init();
		
	}
}
