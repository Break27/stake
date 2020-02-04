package com.github.break27;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.Pixmap.Format;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.github.break27.screen.GameScreen;
import com.github.break27.screen.MainScreen;

public class GameApp extends Game {
	public MainScreen mainScreen;
	public GameScreen gameScreen;
	
	SpriteBatch batch;
	Pixmap pxmapArea;
	Pixmap pxmapSnake;
	Texture textArea;
	Texture textSnake;
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		pxmapArea = new Pixmap(600, 600, Format.RGBA8888);
		pxmapArea.setColor(Color.BLACK);
		pxmapArea.fill();
		textArea = new Texture(pxmapArea);
		
		mainScreen = new MainScreen(this);
		gameScreen = new GameScreen(this);
		setScreen(gameScreen);
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(1, 1, 1, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		batch.draw(textArea, 12, 12);
		batch.end();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		pxmapArea.dispose();
	}
}
