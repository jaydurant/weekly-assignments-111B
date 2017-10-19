// Jason Durant
public class CircleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle circle1 = new Circle(new Point(2,3),2);
		Circle circle2 = new Circle(2,2,3);
		Circle circle3 = new Circle();
		Circle circle4 = new Circle(circle1);
		
		System.out.println("Circle 1 equals circle 4 :" + circle1.equals(circle4) );
		System.out.println("Circle 1 equals circle 3 :" + circle1.equals(circle3) );
		System.out.println(circle1);
		System.out.println("Circle 1 overlaps circle2:" + circle1.doesOverlap(circle2));
		System.out.println("Circle 1 overlaps circle3:" + circle1.doesOverlap(circle3));
	}

}
