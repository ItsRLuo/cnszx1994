package com.mysam.sam.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.mysam.sam.gameSam;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.title = "CodeNameSam";
		config.width = 500;
		config.height = 300;
		
		new LwjglApplication(new gameSam(), config);
	}
}
