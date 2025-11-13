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
	Car g5;
	Car tesla;
	Car jeep;
	Car astonMarton;
	Car honda;
	
	
	@Override
	public void settings() {
		size(WIDTH, HEIGHT);
	}

	@Override
	public void setup() {
		bmw = new Car(600, 200, 50, 5);
		porsche = new Car(500, 400, 50, 3);
		mustang = new Car(700, 350, 50, 1);
		ford = new Car(600, 500, 50, 2);
		g5 = new Car(550, 100, 50, 3);
		tesla = new Car(750, 450, 50, 4);
		jeep=new Car(650, 250, 50, 6);
		honda = new Car(769, 300, 50, 7);
		astonMarton =new Car(650, 450, 50, 8);
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
		g5.display();
		g5.moveRight();
		tesla.display();
		tesla.moveLeft();
		jeep.display();
		jeep.moveRight();
		honda.display();
		honda.moveLeft();
		astonMarton.display();
		astonMarton.moveLeft();
		if(intersects(bmw)) {
			System.out.println("Game is over");
			x = 400;
			y= 579;
		}
		if(intersects(porsche)) {
			System.out.println("You suck");
		}
		if(intersects(ford)) {
			System.out.println("Your dead");
		}
		if(intersects(mustang)) {
			System.out.println("You lost");
		}
		if(intersects(g5)) {
			System.out.println("Game over");
		}
		if(intersects(tesla)) {
			System.out.println(":(");
		}
		if(intersects(jeep)) {
			System.out.println("game dead");
		}
		if(intersects(honda)) {
			System.out.println("You bad");
		}
		if(intersects(astonMarton)) {
			System.out.println("bye bye");
		}
	}

	static public void main(String[] args) {
		PApplet.main(Frogger.class.getName());
	}

	public void keyPressed() {
		if (key == CODED) {
			// Frog Y position goes up
			if (keyCode == UP) {
				if (y > 20)
					y -= 10;
			}
			// Frog Y position goes down
			else if (keyCode == DOWN) {
				if (y < 579) {
					y += 10;
				}

			}
			// Frog X position goes right
			else if (keyCode == RIGHT) {
				if (x < 780) {
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
	boolean intersects(Car car) {
		if ((y > car.getY() && y < car.getY() + 50) && (x > car.getX() && x < car.getX() + car.getSize())) {
			return true;
		} else {
			return false;
		}
	}

	class Car {
		int xPosition;
		int yPosition;
		int sizeOfCar;
		int speedOfCar;

		Car(int xPosition, int yPosition, int sizeOfCar, int speedOfCar) {
			this.xPosition = xPosition;
			this.yPosition = yPosition;
			this.sizeOfCar = sizeOfCar;
			this.speedOfCar = speedOfCar;
		}

		void display() {
			fill(0, 255, 0);
			rect(xPosition, yPosition, sizeOfCar, 50);
		}

		void moveLeft() {
			xPosition -= speedOfCar;
			if (xPosition <= -sizeOfCar) {
				xPosition = WIDTH;
			}
		}

		void moveRight() {
			xPosition += speedOfCar;
			if (xPosition >= 800) {
				xPosition = -sizeOfCar;
			}
		}

		int getX() {
			return xPosition;
		}

		int getY() {
			return yPosition;
		}

		int getSize() {
			return sizeOfCar;
		}

		
	}
}