package Q3;

	public class Circle {
	    double radius;

	    // Constructor with no arguments
	    public Circle() {
	        this.radius = 0.0;
	    }

	    // Constructor with two arguments
	    public Circle(double radius, double circumference) {
	        this.radius = radius;
	        if (circumference > 0) {
	            this.radius = circumference / (2 * Math.PI);
	        }
	    }
	    public double calculateCircumference() {
	        return 2 * Math.PI * radius;
	    }
	    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Argument Value
        Circle circle1 = new Circle(5.0, 0.0);
        //No Argument Value
        Circle circle2 = new Circle();

        System.out.println("Circle 1 Circumference: " + circle1.calculateCircumference());
        System.out.println("Circle 2 Circumference: " + circle2.calculateCircumference());
	}
}