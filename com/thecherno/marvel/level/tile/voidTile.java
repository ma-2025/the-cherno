package com.thecherno.marvel.level.tile;

import com.thecherno.marvel.graphics.Screen;
import com.thecherno.marvel.graphics.Sprite;

public class voidTile extends Tile {

	public voidTile(Sprite sprite) {
		super(sprite);
	}
	
	public void render (int x, int y, Screen screen) {
		screen.renderTile(x, y, this);
	}

}
