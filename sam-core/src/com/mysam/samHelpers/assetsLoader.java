package com.mysam.samHelpers;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.Texture.TextureFilter;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class assetsLoader {

    public static Texture texture;
    public static Texture sam1, sam2;
    public static Texture bg;

    public static Animation birdAnimation;
    public static TextureRegion bird, birdDown, birdUp;


    public static void load() {

       texture = new Texture(Gdx.files.internal("sam1.png"));
       texture.setFilter(TextureFilter.Nearest, TextureFilter.Nearest);

       sam1 = new Texture("sam1.png");
      sam2 = new Texture("sam2.png");
        
        bg = new Texture("4.jpg");
        

    }

    public static void dispose() {
        // We must dispose of the texture when we are finished.
        texture.dispose();
    }

}
