package _06_frogger;

import processing.core.PApplet;

public class Frogger extends PApplet {
	static final int WIDTH = 800;
	static final int HEIGHT = 600;
	int x = 400;
	int y = 579;
	Car bmw;
	Car porsche;
	Car mustang;
	Car ford;

	@Override
	public void settings() {
		size(WIDTH, HEIGHT);
	}

	@Override
	public void setup() {
bmw = new Car(678,  545, 50, 3);
porsche = new Car(500, 500, 50, 3);
mustang =  new Car(700, 500, 50, 3);
ford =new Car(600, 500, 50, 3);
	}

	@Override
	public void draw() {
		background(0, 0, 150);
		fill(0, 20, 30);
		ellipse(x, y, 30, 30);
bmw.display();
porsche.display();
mustang.display();
ford.display();
bmw.moveLeft();
porsche.moveLeft();
mustang.moveLeft();
ford.moveRight();
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
	class Car{
		int xPosition;
		int yPosition;
		int sizeOfCar;
		int speedOfCar;
		Car(int xPosition, int yPosition, int sizeOfCar, int speedOfCar){
		this.xPosition= xPosition;
		this.yPosition = yPosition;
		this.sizeOfCar = sizeOfCar;
		this.speedOfCar = speedOfCar;
	}
		
	
		void display()
		  {
		    fill(0,255,0);
		    rect(xPosition , yPosition,  sizeOfCar, 50);
		  }
		void moveLeft() {
			xPosition-=speedOfCar;
			if(xPosition <= -sizeOfCar) {
				xPosition = WIDTH;
			}
		}
		void moveRight() {
			xPosition+=speedOfCar;
			if(xPosition >= 800) {
				xPosition = -sizeOfCar;
			}
		}
}
}
