public class GridWriterProgram {
	
	public static void main(String[] args) {
		GridWriter gw = new GridWriter(40, 50);
		
		//gw.add(new MyCircle(10, 10, 9));
		//gw.add(new MyCircle(25, 20, 12));
		//gw.add(new MyCircle(25, 20, 5));
		
		gw.add(new MySquare(10,10,1));
		gw.add(new MySquare(1,1,1));
		gw.add(new MySquare(20,20,1));
		
		gw.add(new MyRectangle(25, 25, 20, 15));
		gw.add(new MyRectangle(5, 5, 3, 4));
		gw.add(new MyRectangle(40, 0, 10, 10));
		
		gw.display();
	}
	
}
