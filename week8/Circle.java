// Jason Durant

public class Circle {
	private Point center;
	private double radius;
	
	public Circle(Point o, double r){
		center = new Point(o);
		radius = r;
	}
	
	public Circle(double xValue, double yValue, double r) {
		this(new Point(xValue,yValue),r);
	}
	
	public Circle(){
		this(new Point(0,0),1);
	}
	
	public Circle(Circle c){
		this(new Point(c.getCenter()),c.getRadius());

	}
	
	public Point getCenter() {
		return new Point(center);
	}
	
	public void setCenter(Point p){
		center = new Point(p);
	}
	
	public double getRadius(){
		return radius;
	}
	
	public void setRadius(double value){
		radius = value;
	}
	
	public void setX(double x) {
		center.setX(x);
	}
	
	public double getX() {
		return center.getX();
	}
	
	public void setY(double y) {
		center.setY(y);
	}
	
	public double getY() {
		return center.getY();
	}
	
	public double getArea(){
		return Math.PI * Math.pow(radius,2);
	}
	
	public boolean doesOverlap(Circle c){
		double xRange = Math.abs(center.getX() - c.getX());
		double yRange = Math.abs(center.getY() - c.getY());
		
		double sideSquared= Math.pow(xRange,2) + Math.pow(yRange,2);
		double distanceBetweenCenters = Math.sqrt(sideSquared);
		
		double radiusSummed = radius + c.getRadius();
		
		return distanceBetweenCenters <  radiusSummed ? true : false ;
	}
	
	public String toString() {
		return "x is "+ center.getX() + " y is " + center.getY() + " radius is " + radius;
	}
	
	public boolean equals(Circle c){
		return (c.getX() == this.getX()) && (c.getY() == this.getY()) && (this.getRadius() == c.getRadius());
	}
}
