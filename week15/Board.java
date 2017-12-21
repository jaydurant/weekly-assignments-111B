// Jason Durant

import java.util.*;

public class Board {
	private int row;
	private int col;
	private List<Point> grid = new ArrayList<>();
	private List<Ship> sunkShips = new ArrayList<>();
	public List<Ship> ships  = new ArrayList<>();
	
	public Board(int col, int row){
		for(int i = row - 1; i > -1; i--){
			for(int y = 0; y < col; y++){
				grid.add(new Point(y,i,'~'));
			}
		}
	}
	
	public void display() {
		int length = col;
		int y = col;
		int x = row;
		
		for(int i = 0 ; i < grid.size(); i++) {
			//System.out.print(i);
				if(i % (length + 1) == 0) {
					System.out.print(y);
					System.out.print(' ');
					y--;
				}
				if(i == (length + 1)){
					System.out.print(grid.get(i).getC());
					System.out.print("\n");
					length += 10;
					
				}else {
					System.out.print(grid.get(i).getC());
					System.out.print(' ');
				}
		}
		
		for(int i = 0; i < x; i++) {
			if(i == 0) {
				System.out.print("  ");
				System.out.print(i);
			}else {
				System.out.print(" ");
				System.out.print(i);
			}
			
			
			
		}
	}
	
	public void addShip(Ship s) {
		ships.add(s);
	}
	
	public boolean isHit(Point p) {
		for(Ship ship: ships) {
			if(ship.containsPoint(p)) {
				ship.shotFiredAtPoint(p);
				replacePoint(p,'X');
				if(ship.length == ship.hitCount()){
					isSunk(ship);
				}
				return true;
			}
		}
		
		replacePoint(p,'.');
		
		return false;
	}
	
	public void replacePoint(Point p, char c) {
		for(Point g : grid ) {
			if(g.getX() == p.getX() && g.getY() == p.getY()) {
				g.setC(c);
			}
		}
	}
	
	private void isSunk(Ship ship) {
		sunkShips.add(ship);
		
		System.out.println("you sank a ship with length " + ship.length + "!");
	}
	
	public int numberOfShipsSunk() {
		return sunkShips.size();
	}
	

}
