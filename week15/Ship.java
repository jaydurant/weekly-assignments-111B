//Jason Durant

import java.util.*;

public class Ship {
	private Point origin;
	private int hitCount = 0;
	public boolean isVertical;
	public int length;
	public List<Point> shipPoints = new ArrayList<>();
	private List<Point> hitPoints = new ArrayList<>();
	
	public Ship(Point origin,boolean isVertical, int length) {
		this.origin = origin;
		this.isVertical = isVertical;
		this.length = length;
		
		if(isVertical){
			for(int i = 0; i < length; i++) {
				shipPoints.add(new Point(this.origin.getX(), this.origin.getY() + i));
			}
		} else {
			for(int i = 0; i < length; i++) {
				shipPoints.add(new Point(this.origin.getX() + 1, this.origin.getY()));
			}
		}
	}
	
	public int hitCount() {
		return hitCount;
	}
	
	public boolean containsPoint(Point p) {
		for(Point point : shipPoints) {
			if(point.getX() == p.getX() && point.getY() == p.getY()) {
				return true;
			}
		}
		
		return false;
	}
	
	public boolean collidesWith(Ship s) {
		for(Point sPoint : s.shipPoints){
			if(containsPoint(sPoint)){
				return true;
			}
		}
		
		return false;
	}
	
	public void shotFiredAtPoint(Point p){
		if(!isHitAtPoint(p)) {
			if(containsPoint(p)) {
				hitPoints.add(p);
			}
		}
		
	}
	
	public boolean isHitAtPoint(Point p ) {
		for(Point point : hitPoints){
			if(point.getX() == p.getX() && point.getY() == p.getY()) {
				return true;
			}
		}
		
		return false;
	}
}
