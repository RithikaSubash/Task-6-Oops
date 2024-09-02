package javaoops;

 public class Circle {
	
		    double radius;

		    public Circle() {
		        this.radius = 2.0; //
		    }

		    public Circle(double radius) {
		        this.radius = radius;
		    }

		    public double calculateCircumference() {
		        return 2 * Math.PI * radius;
		    }

		    public double getRadius() {
		        return radius;
		    }

}
