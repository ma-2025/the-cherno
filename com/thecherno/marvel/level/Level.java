package com.thecherno.marvel.level;

import com.thecherno.marvel.graphics.Screen;
import com.thecherno.marvel.level.tile.Tile;

public class Level {
	
	protected int width,height;
	protected int[] tiles;
	
	public Level (int width, int height) {
		this.width = width ;
		this.height = height;
		tiles = new int [ width * height ];
		generateLevel();
	}
	
	public Level ( String path ) {
		loadLevel ( path );
	}

	protected void generateLevel() {	
	}
	
	private void loadLevel ( String path ) {
	}
	
	public void update() {
	}
	
	private void time() {
		
	}
	
	public void render(int xScroll, int yScroll, Screen screen) {
		screen.setOffset(xScroll, yScroll);
		int x0 = xScroll >> 4;
		int x1 = (xScroll + screen.width) >> 4;
		int y0 = yScroll >> 4;
		int y1 = (yScroll + screen.height) >> 4;
	}
	
	public Tile getTile (int x, int y){
		if (tiles [x + y * width] == 0 )return Tile.grass;
		return Tile.voidTile;
		
	}
	
}
