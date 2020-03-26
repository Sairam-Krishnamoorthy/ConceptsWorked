package sai.work.in;

public class Human//Object
{

	String name;
	int age;
	int heightInInches;
	String eyecolour;
	
	//Constructor
	public Human() {
	}
	
	//Methods
   public void speak() {
    System.out.println("Hello My Name is"+ name);//String Concatination
    System.out.println("I am" + heightInInches + "inches tall");
    System.out.println("I am" + age + "years old");
    System.out.println("My Eye Colour is"  + eyecolour);
    }

   public void eat() {
	   System.out.println("Eating...");
   }
    
   public void walk() {
	   System.out.println("walking...");
   }
	
   public void work() {
	   System.out.println("Working...");
   }
   
}
