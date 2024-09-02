package javaoops;

public class Main3 {
	  public static void main(String[] args) {
	
	        Circle circle1 = new Circle();
	        System.out.println("Circle 1: ");
	        System.out.println("Radius: " + circle1.getRadius());
	        System.out.println("Circumference: " + circle1.calculateCircumference());
	        
	        Circle circle2 = new Circle(3.0);
	        System.out.println("\nCircle 2: ");
	        System.out.println("Radius: " + circle2.getRadius());
	        System.out.println("Circumference: " + circle2.calculateCircumference());
	    }
	}


