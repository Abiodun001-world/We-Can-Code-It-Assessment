/* //Writing Hello World in Java
class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
  }
}
*/
/* // Variables, Operators, and Expressions, oh my! in java
 class Main {
 public static void main(String[] args) {
   String message;
   message = "Keep up the good work!";
   System.out.println(message);
 }
 }
*/
 /* //Using Operators to Create Expressions
int a = 10;
int b = a;
int c = a + b;
System.out.println(c);
*/
 /* //These three variables are considered “properties” of our Car
  class Car {
 public String make;
 public String model;
 public int speed;
// This is known as a constructor, and allows us to make new cars.
 public Car(String makeName, String modelName) {
 make = makeName;
 model = modelName;
 speed = 0;
 }
 // These are our class’s “methods”, or actions that a car can perform
 public void accelerate() {
   speed += 5;
   System.out.println(speed);
 }
 public void stop() {
   speed = 0;
   System.out.println(speed);
}
}
*/
// Methods
  /* public void stop() {
   speed = 0;
   System.out.println(speed);
}
*/ 
 /* // simple way of Methods 
 class Main {
 public static void main(String[] args) {
   // This is a variable declaration, with the value equal to a car object
   // The car class's constructor allows us to store a car as a variable
   // Notice the TYPE of variable is Car, the class name
   Car myCar = new Car("Chrysler","PT Cruiser");

   // This method call would increase the car's speed to 5 and print it
   myCar.accelerate();
   // Another method call would increase the car's speed from 5 to ten
   myCar.accelerate();
   // This method call would set the car's speed back to 0
   myCar.stop();
 }
}
*/
 /* // Conditionals and Booleans 
int a = 5;
if(a < 3){
 System.out.println("Cat");
} 
else if (a == 5){
 System.out.println("Dog");
} 
else {
System.out.println("Fish");
}
*/
/* // While Loops
int count = 1;
while(count < 6){
  System.out.println("I have run " + count + " times!");
  count++;
}
*/
/* // infinite loops
int count = 1;
while(count < 6){
  System.out.println("This is an infinite loop!");
}
*/
 /* // user input 
import java.util.Scanner;
public class NamePromptApp {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Abiodun");
		String name = input.nextLine();              
            System.out.println("Hello, " + name);
		input.close();
	}
}
*/




