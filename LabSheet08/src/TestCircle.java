
public class TestCircle {

	public static void main(String[] args) {
		Circle c1 = new Circle();
		Circle c2 = new Circle();
		//assign radius to object c1 and display
		c1.radius =12.5;
		System.out.println("Radius of object c1 = "+c1.getRadius());
		System.out.println("Area of object c1 = "+c1.getArea());
		System.out.println();
		
		c2.radius = 5.5;
		System.out.println("Radius of object c2 = "+c2.getRadius());
		System.out.println("Area of object c2 = "+c2.getArea());
		
		
		System.out.println(showColor("red"));
	}
	//create a static method
	public static String showColor(String color) {
		return "The color is "+ color;
	}
}
