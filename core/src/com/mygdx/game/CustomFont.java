package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class CustomFont extends ApplicationAdapter {
    SpriteBatch batch;
    BitmapFont bmFont;

    @Override
    public void create() {
        batch = new SpriteBatch();
        bmFont = new BitmapFont(Gdx.files.internal("customFont.fnt")); //create your own font using hiero and put it in your assets folder
        //hiero is an internal program that allows you to create custom fonts, you can find it under in libdgx tools after you drop expand the your librays.
    }

    @Override
    public void render() {
        Gdx.gl.glClearColor(0, 0, 0, 1); //black background
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        batch.begin();
        bmFont.draw(batch, "Hello World", Gdx.graphics.getWidth() / 2, Gdx.graphics.getHeight() / 2); //centering the text
        batch.end();
    }
}