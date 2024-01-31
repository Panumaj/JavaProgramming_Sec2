
public class Rectangle extends Shape{
	private double width;
	private double length;
	Rectangle(double width,double length,String color) {
		super(color);
		this.width = width;
		this.length = length;
		
	}
	public double getWidth(){
		return this.width;
	}
	public double getLength() {
		return this.length;
	}
	@Override
	public String toString() {
		return "Rectangle[width= "+width+"],Length="
				+length+","+super.toString();
	}
	@Override
	public double getArea() { //implement getArea() method from abstract class Shape
		return this.width * this.length;
	}
}
