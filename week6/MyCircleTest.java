//Jason Durant

public class MyCircleTester {

	public static void main(String[] args) {
		
		MyCircle circle1 = new MyCircle();
		MyCircle circle2 = new MyCircle();
		MyCircle circle3 = new MyCircle();
		
		circle1.setRadius(4);
		circle1.setX(1);
		circle1.setY(1);
		
		circle2.setRadius(2);
		circle2.setX(2);
		circle2.setY(2);
		
		
		circle3.setRadius(3);
		circle3.setX(10);
		circle3.setY(1);
		
		
		System.out.println("circle1 area:" + circle1.getArea());
		System.out.println("circle2 area:" + circle2.getArea());
		System.out.println("circle3 area:" + circle3.getArea());
		
		
		System.out.println("Does circle1 overlap circle2:" + circle1.doesOverlap(circle2));
		System.out.println("Does circle1 overlap circle3:" + circle1.doesOverlap(circle3));
		System.out.println("Does circle2 overlap circle3:" + circle3.doesOverlap(circle2));
		
		
	}

}
