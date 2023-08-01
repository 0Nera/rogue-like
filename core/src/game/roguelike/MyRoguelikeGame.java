package game.roguelike;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;

import game.roguelike.screens.GameScreen;

public class MyRoguelikeGame extends Game {
	
	@Override
	public void create() {
		setScreen(new GameScreen());
	}

	@Override
	public void render() {
		super.render();
	}
	
	@Override
	public void dispose() {
		super.dispose();
	}
	
	@Override
	public void pause() {
		Vars.isPaused = true;
		super.pause();
	}
	
	@Override
	public void resume() {
		Vars.isPaused = false;
		super.resume();
	}
}
