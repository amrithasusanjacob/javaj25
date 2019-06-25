package circle;
public class circleprg {
	
	// PROPERTIES
	// --------------------
	private double radius = 5;
	
		
	// CONSTRUCTOR
	// --------------------
	public circleprg(double r) {
		this.radius = r;
	}
	
	// CUSTOM METHODS
	// --------------------
	public double getArea() {
		double area = Math.PI * this.radius * this.radius;
		System.out.println("Area: " + area);
		return area;
	}
	public double getCircumference() 
	{
		double c = Math.PI * 2 * this.radius;
		System.out.println("Circumfrence: " + c);
		return c;
	}
	public double getDiameter() {
		double diameter =2* this.radius;
		System.out.println("Diameter: "+ diameter);
		return diameter;
	}
	
	
	// GETTERS AND SETTERS
	// --------------------
	public double getRadius() {
		return radius;
	}


	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	
	
	
	
	
}