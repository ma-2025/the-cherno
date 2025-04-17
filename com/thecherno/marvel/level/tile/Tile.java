package com.thecherno.marvel.level.tile;

import com.thecherno.marvel.graphics.Screen;
import com.thecherno.marvel.graphics.Sprite;

public class Tile {
	
	public int x, y;
	public Sprite sprite;
	
	public Tile(Sprite sprite) {
		this.sprite = sprite;
	}
	
	public void render (int x, int y, Screen screen) {
	}
	
	public boolean soild() {
		return false;
	}

}
