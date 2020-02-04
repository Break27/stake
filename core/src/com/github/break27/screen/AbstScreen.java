package com.github.break27.screen;

import com.badlogic.gdx.Screen;
import com.github.break27.GameApp;

public abstract class AbstScreen implements Screen {
	
	GameApp game;
	
	public AbstScreen(GameApp game) {
		this.game = game;
	}
	
	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}
	
	public abstract void handleInput();
	public abstract void update(float delta);
	
	@Override
	public void render(float delta) {
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
