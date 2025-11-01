package _06_frogger;

import processing.core.PApplet;

public class Frogger extends PApplet {
	static final int WIDTH = 800;
	static final int HEIGHT = 600;
	int x = 400;
	int y = 579;

	@Override
	public void settings() {
		size(WIDTH, HEIGHT);
	}

	@Override
	public void setup() {

	}

	@Override
	public void draw() {
		background(0, 0, 150);
		fill(0, 20, 30);
		ellipse(x, y, 30, 30);

	}

	static public void main(String[] args) {
		PApplet.main(Frogger.class.getName());
	}

	public void keyPressed() {
		if (key == CODED) {
			// Frog Y position goes up
			if (keyCode == UP) {
				if(y > 20)
				y -= 10;
			}
			// Frog Y position goes down
			else if (keyCode == DOWN) {
				if(y < 579) {
					y += 10;
				}
				
			}
			// Frog X position goes right
			else if (keyCode == RIGHT) {
				if(x < 780) {
				x += 10;	
				}
						
			}

			// Frog X position goes left
			else if (keyCode == LEFT) {
				if (x > 20) {
					x -= 10;
				}

			}

		}
	}
}
