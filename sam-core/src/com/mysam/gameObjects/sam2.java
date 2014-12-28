package com.mysam.gameObjects;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.math.Vector2;

// Right Samurai
public class sam2 {
	private Vector2 position;
	private Vector2 velocity;
	private Vector2 acceleration;
	
	private int width;
	private int height;
	
	public sam2(float x, float y, int width, int height){
		this.width = width;
		this.height = height;
		
		position = new Vector2(x, y);
		velocity = new Vector2(0, 0);
		acceleration = new Vector2(500, 0);

		
	}
	public void onClick() {
        
    }
	
	public void update(float delta){
		velocity.add(acceleration.cpy().scl(delta));

        if (velocity.x > 500) {
            velocity.x = 500;
        } 
        if (position.x > -230){
        	Gdx.app.log("as","as");
        }
        else{
        	//Gdx.app.log(Float.toString(position.x),"s");
        	position.add(velocity.cpy().scl(delta));
        }
        	
        // Rotate counterclockwise



	}

	public void onSwipe(){
		// TODO: onSwipe should have param float speed, higher the floar => fast
	}
	public float getX() {
        return position.x;
    }

    public float getY() {
        return position.y;
    }

    public float getWidth() {
        return width;
    }

    public float getHeight() {
        return height;
    }
    
//    public float getRotation() {
//        return rotation;
//    }
	
}
