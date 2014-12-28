package com.mysam.gameObjects;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.math.Vector2;

//Left Samurai
public class sam {
	private Vector2 position;
	private Vector2 velocity;
	private Vector2 acceleration;
	
	private int width;
	private int height;
	
	public sam(float x, float y, int width, int height){
		this.width = width;
		this.height = height;
		
		position = new Vector2(x, y);
		velocity = new Vector2(0, 0);
		acceleration = new Vector2(500, 0);

		
	}
	public void onClick() {
        Gdx.app.log("asd","asd");
    }
	
	public void update(float delta){
		velocity.add(acceleration.cpy().scl(delta));

        if (velocity.x > 500) {
            velocity.x = 500;
        }
        if (position.x > 200){
        	
        }
        else{
        	position.add(velocity.cpy().scl(delta));
        }
        //Gdx.app.log(Float.toString(position.x),"asd");
        

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
