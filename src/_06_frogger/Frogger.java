package _06_frogger;

import javax.swing.JColorChooser;
import javax.swing.JOptionPane;

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
	JColorChooser colorC = new JColorChooser();
	
	@Override
	public void settings() {
		size(WIDTH, HEIGHT);
	}

	@Override
	public void setup() {
		bmw = new Car(600, 200, 50, 5);
		porsche = new Car(500, 400, 50, 6);
		mustang = new Car(700, 350, 50, 5);
		ford = new Car(600, 500, 50, 7);
		g5 = new Car(550, 100, 50, 7);
		tesla = new Car(750, 450, 50, 7);
		jeep=new Car(650, 250, 50, 6);
		honda = new Car(769, 300, 50, 7);
		astonMarton =new Car(650, 450, 50, 8);
		
		JOptionPane.showMessageDialog(colorC, colorC);
	}

	@Override
	public void draw() {
		background(0, 0, 0);
		int red = colorC.getColor().getRed();
		int green = colorC.getColor().getGreen();
		int blue = colorC.getColor().getBlue();
		fill(red, green, blue);
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
		 x = 400;
		 y = 579;
		}
		if(intersects(ford)) {
			System.out.println("Your dead");
			 x = 400;
			 y = 579;
		}
		if(intersects(mustang)) {
			System.out.println("You lost");
			 x = 400;
			 y = 579;
		}
		if(intersects(g5)) {
			System.out.println("Game over");
			x = 400;
			y = 579;
		}
		if(intersects(tesla)) {
			System.out.println(":(");
			x = 400;
			y = 579;
		}
		if(intersects(jeep)) {
			System.out.println("game dead");
			x = 400;
			y = 579;
		}
		if(intersects(honda)) {
			System.out.println("You bad");
			x = 400;
			y = 579;
		}
		if(intersects(astonMarton)) {
			System.out.println("bye bye");
			x = 400;
			y = 579;
		}
		if(y < 20) {
			JOptionPane.showMessageDialog(null,"You won");
	x = 400;
	y = 579;
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
					y -= 15;
			}
			// Frog Y position goes down
			else if (keyCode == DOWN) {
				if (y < 579) {
					y += 15;
				}

			}
			// Frog X position goes right
			else if (keyCode == RIGHT) {
				if (x < 780) {
					x += 15;
				}

			}

			// Frog X position goes left
			else if (keyCode == LEFT) {
				if (x > 20) {
					x -= 15;
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
			fill(255,255, 255);
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