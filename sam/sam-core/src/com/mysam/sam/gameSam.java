package com.mysam.sam;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mysam.samHelpers.assetsLoader;
import com.mysam.screen.*;

public class gameSam extends Game {
	

    @Override
    public void create() {
        Gdx.app.log("samGame", "created");
        assetsLoader.load();
        setScreen(new screen());
    }

    @Override
    public void dispose() {
        super.dispose();
        assetsLoader.dispose();
    }
}
