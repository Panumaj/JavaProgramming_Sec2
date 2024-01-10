import java.text.*;
public class TestCircleA {

	public static void main(String[] args) {
		
		DecimalFormat frmID = new DecimalFormat ("#.##");
		CircleA c1 = new CircleA();
		CircleA c2 = new CircleA();
		CircleA c3 = new CircleA();
		
		
		c1.setRadius(2.0);
		c1.setColor("blue");
		System.out.print("Circle of object c1 area is "+c1.getArea());
		System.out.println(", and color is "+c1.getColor());
		
		c2.setRadius(2.0);
		c2.setColor("red");
		System.out.print("Circle of object c1 area is "+c2.getArea());
		System.out.println(", and color is "+c2.getColor());
		
		c3.setRadius(1.0);
		c3.setColor("red");
		System.out.print("Circle of object c1 area is "+c3.getArea());
		
	}

}
