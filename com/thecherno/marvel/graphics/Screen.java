package com.thecherno.marvel.graphics;

import java.util.Random;

public class Screen {
	
	private int width, height;
	public int[] pixels;
	
	public int[] tiles = new int [64 * 64];
	
	private Random random = new Random();
	
	public Screen(int width, int height) {
		this.width = width;
		this.height = height;
		pixels = new int[width * height]; //0 - 50,399 = 50,400
		
		for (int i = 0; i < 64*64; i++){
			tiles[i] = random.nextInt(0xffffff);
		}
	}
	
	public void clear ()
	{
		for(int i = 0;  i < pixels.length; i++) {
			pixels [i] = 0;
		}
	}
	
	public void render() {
		for(int y = 0; y < height; y++) {
			int yy = y;
			//if (yy <0 ||yy >= height) break;
			for(int x = 0; x < width; x++) {
				int xx = x - 22;
				//if(xx < 0 || xx >= width) break;
				int tileIndex = ((xx >> 4) & 63) + ((yy >> 4) & 63) * 64;
				pixels[xx + yy * width] = tiles[tileIndex]; 
			}
		}
	}

}
