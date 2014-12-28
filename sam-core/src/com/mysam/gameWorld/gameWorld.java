package com.mysam.gameWorld;

import com.mysam.gameObjects.sam;
import com.mysam.gameObjects.sam2;

public class gameWorld {
	/**
	 * TODO: box detection for position of sam1 and sam2 touch each other.
	 * TODO: if speed is higher than the swords required unsheathing speed then
	 * send ping to host declaring a successful unsheathing of sword if ping is 
	 * the first to arrive than win other lose.
	 */
	
	private sam sam1;
	private sam2 sam2;
	
	public gameWorld(int midPointY){
		sam1 = new sam(20, midPointY, 17, 17);
		sam2 = new sam2(-400, midPointY, 17, 17);
	}
	
	public void update(float delta){
		sam1.update(delta);
		sam2.update(delta);
	}
	
	public sam getSam1(){
		return sam1;
	}
	
	public sam2 getSam2(){
		return sam2;
	}
	
	
}
