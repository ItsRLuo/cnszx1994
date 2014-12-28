package com.mysam.gameWorld;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer.ShapeType;
import com.mysam.gameObjects.sam;
import com.mysam.gameObjects.sam2;
import com.mysam.samHelpers.assetsLoader;

public class gameRenderer {
	
	private gameWorld myWorld;
	private OrthographicCamera cam;
    private ShapeRenderer shapeRenderer;

    private SpriteBatch batcher;

    private int sam1y; //where Sam is!
    private int gameHeight;
    
    // Game Objects 
    private sam sam1c;
    private sam2 sam2c;
    private Texture sam1, sam2;
    private Texture bg;
    
    // Game Assets 
    //private backGround bg;
    //private foreGround fg;
//    private TextureRegion birdMid, birdDown, birdUp;
//    private TextureRegion skullUp, skullDown, bar;
    
    Texture img;
    public gameRenderer(gameWorld world, int gameHeight, int sam1y){
    	myWorld = world;
    	this.gameHeight = gameHeight;
    	
    	cam = new OrthographicCamera();
        cam.setToOrtho(true, 136, gameHeight);
        
        batcher = new SpriteBatch();
        //batcher.setProjectionMatrix(cam.combined);
        shapeRenderer = new ShapeRenderer();
        shapeRenderer.setProjectionMatrix(cam.combined);
        
        // Call helper methods to initialize instance variables
        initGameObject();
        initAssets();
    }
    
    public void render(float runTime) {
    	
    	
    	 Gdx.gl.glClearColor(0, 0, 0, 1);
         Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

         shapeRenderer.begin(ShapeType.Filled);

         // Draw Background color
         shapeRenderer.setColor(55 / 255.0f, 80 / 255.0f, 100 / 255.0f, 1);
         shapeRenderer.rect(100, 100, 136, sam1y + 66);

         shapeRenderer.end();

         batcher.begin();
         batcher.disableBlending();
         batcher.draw(bg, 0, 0);
         batcher.draw(sam1,sam1c.getX(),0);
         batcher.draw(sam2,sam2c.getX()*-1,0);
         batcher.enableBlending();
         batcher.end();
    }
    
    public void initGameObject(){
    	sam1c = myWorld.getSam1();
    	sam2c = myWorld.getSam2();
    }
    
    public void initAssets(){
    	assetsLoader.load();
    	sam1 = assetsLoader.sam1;
    	sam2 = assetsLoader.sam2;
    	bg = assetsLoader.bg;
    	//birdAnimation = AssetLoader.birdAnimation;
    }
    
    
}
