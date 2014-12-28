package com.mysam.samHelpers;

import com.badlogic.gdx.InputProcessor;
import com.mysam.gameObjects.sam;
import com.mysam.gameObjects.sam2;

public class inputHandler implements InputProcessor{
	private sam mysam1;
	private sam2 mysam2;
	
	public inputHandler(sam sam1){
		mysam1 = sam1;
		
	
	}

	 @Override
	    public boolean touchDown(int screenX, int screenY, int pointer, int button) {
	        mysam1.onClick();
	        
	        return true; // Return true to say we handled the touch.
	    }

	 @Override
	    public boolean keyDown(int keycode) {
	        return false;
	    }

	    @Override
	    public boolean keyUp(int keycode) {
	        return false;
	    }

	    @Override
	    public boolean keyTyped(char character) {
	        return false;
	    }

	    @Override
	    public boolean touchUp(int screenX, int screenY, int pointer, int button) {
	        return false;
	    }

	    @Override
	    public boolean touchDragged(int screenX, int screenY, int pointer) {
	        return false;
	    }

	    @Override
	    public boolean mouseMoved(int screenX, int screenY) {
	        return false;
	    }

	    @Override
	    public boolean scrolled(int amount) {
	        return false;
	    }

}
