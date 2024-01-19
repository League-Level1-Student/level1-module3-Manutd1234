package _01_intro_to_static;

/*
 * Instructions are in the StaticKeywordDemo class
 */
public class StaticKeywordDemoRunner {
    public static void main(String[] args) {
        new StaticKeywordDemo();
    }
static int var = 1;
static Robot rob;
static float calculateArea(float width, float height){ // code }
	
}
	public class Athlete {
		  static String raceLocation = "New York";
		  static String raceStartTime = "9.00am";

		  String name;
		  int speed;
		  int bibNumber;
		  
		  Athlete (String name, int speed){ 
		      this.name = name;
		      this.speed = speed;
		  }

		  static double calculateDuration(double startSec, double finishSec){ // code }

		  void run(){ // code }
			  
		  }
		  Athlete.raceLocation = "NYC";           // OK!
		  Athlete.name = "Jim";                   // ERROR!

		  Athlete jim = new Athlete("Jim", 10);   // Athlete object/instance jim

		  jim.raceLocation = "Boston";            // OK!
		  jim.name = "Jimmy";                      // OK!
		      
				  Athlete jim = new Athlete("Jim", 10);
		  Athlete amy = new Athlete("Amy", 6);

		  System.out.@println(jim.name);           // prints "Jim"
		  System.out.println(amy.name);           // prints "Amy"
		  System.out.println(jim.raceStartTime);  // prints "9.00am"
		  System.out.println(amy.raceStartTime);  // prints "9.00am"
		  Athlete.calculateDuration(0.0, 14.7);   // OK!
		  Athlete.run();                          // ERROR!
		  Athlete jim = new Athlete("Jim", 10);
		  jim.run();                              // OK!
		  jim.calculateDuration(0.0, 14.7);       // OK!
		  Athlete.calculateDuration(0.0, 14.7);   // OK!
		  Athlete.run();                          // ERROR!
		  Athlete jim = new Athlete("Jim", 10);
		  jim.run();                              // OK!
		  jim.calculateDuration(0.0, 14.7);       // OK!
		  static double calculateDuration(double startSec, double finishSec){
			    double durationSec = finishSec - startSec;
			    
			    System.out.println(name + " ran the race in " + durationSec + " seconds."); // ERROR! name is non-static
			    return durationSec;
			}
		  public class StaticKeywordDemoRunner {  
			  JFrame frame = new JFrame();
			    frame.addActionListener(this);      // ERROR!
		  }
		  		
		  
		  
	
