package sai.work.in;

public class Earth {

	public static void main(String[] args) {
		
    Human Tom;
    
    Tom = new Human();//Tom is variable and Human is class constructor And Object Tom is created
    Tom.age = 12;
    Tom.eyecolour = "Blue";
    Tom.heightInInches = 72;
    Tom.name = "Tom Thomas";
    
    Tom.speak();//Calling Method
    
    Human Joe;
    
    Joe = new Human();
    Joe.age = 13;
    Joe.eyecolour = "Brown";
    Joe.heightInInches = 114;
    Joe.name = "Joey Samuels";
    
    Joe.speak();
	}

}
