package com.mysam.screen;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.mysam.gameWorld.gameRenderer;
import com.mysam.gameWorld.gameWorld;
import com.mysam.samHelpers.inputHandler;

public class screen implements Screen {
	private gameWorld world;
	private gameRenderer renderer;
	private float runTime;
	
	public screen (){
		float screenWidth = Gdx.graphics.getWidth();
	    float screenHeight = Gdx.graphics.getHeight();
	    float gameWidth = 136;
	    float gameHeight = screenHeight / (screenWidth / gameWidth);
	
	    int midPointY = (int) (gameHeight / 2);
	
	    world = new gameWorld(midPointY);
	    renderer = new gameRenderer(world, (int) gameHeight, midPointY);
        Gdx.input.setInputProcessor(new inputHandler(world.getSam1()));

	    
	}
	 @Override
	    public void render(float delta) {
	        runTime += delta;
	        world.update(delta);
	        renderer.render(runTime);
	    }
	
	
	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void resize(int width, int height) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void resume() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void hide() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		
	}

}
