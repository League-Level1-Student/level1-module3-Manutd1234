

	   public class Student{

	      static int nextId = 786;

	      static String School="Carmel Valley ";

	      int id;
	      String name;
	      int currentLevel;
	      
	      Student (String name, int currentLevel){
	          this.name = name;
	          this.currentLevel = currentLevel; 
	          
	          
	          this.id = nextId;
	          nextId++;
	      } 



	      public static void main(String [] args){ 



	      //create 2 students. 
Student aqeel = new Student("Aqeel", 1);
Student alex = new Student("Alex", 7);
	      //print their names, ids and school. }} 

System.out.println(aqeel.name +" "+ aqeel.id +" "+ aqeel.School);
System.out.println(alex.name +" "+ alex.id +" "+ alex.School);
	      }
	   }



 
