//Jason Durant

public class MyCircle {

	private double radius;
	private double x;
	private double y;
	
	public void setRadius(double rad) {
		radius = rad;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public void setX(double value){
		x = value;
	}
	
	public double getX(){
		return x;
	}
	
	public void setY(double value){
		y = value;
	}
	
	public double getY(){
		return y;
	}
	
	public double getArea() {
		return Math.PI * Math.pow(radius, 2);
	}
	
	public boolean doesOverlap(MyCircle circle){
		double xRange = Math.abs(x - circle.getX());
		double yRange = Math.abs(y - circle.getY());
		
		double sideSquared= Math.pow(xRange,2) + Math.pow(yRange,2);
		double distanceBetweenCenters = Math.sqrt(sideSquared);
		
		double radiusSummed = radius + circle.getRadius();
		
		return distanceBetweenCenters <  radiusSummed ? true : false ;
		
	}
	
}
