package com.thecherno.marvel.level;

public class RandomLevel extends Level{
	
	private final Random random = new Random();
	
	public RandomLevel(int width, int height) {
		super(width, height);
	}
	
	protected void generateLevel() {
		for(int y = 0; y < height; y++) {
			for(int x = 0; x < width; x++) {
				
			}
		}
	}

}
