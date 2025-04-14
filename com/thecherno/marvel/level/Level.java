package com.thecherno.marvel.level;

public class Level {
	
	private int width,height;
	private int[] tiles;
	
	private Level (int width, int height) {
		this.width = width ;
		this.height = height;
		tiles = new int [ width * height ];
		generateLevel();
	}
	
	public Level ( String path ) {
		loadLevel ( path );
	}

	private void generateLevel() {	
	}
	
	private void loadLevel ( String path ) {
	}
	
}
