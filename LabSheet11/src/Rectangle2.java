
public class Rectangle2 implements Shape2{
	private double width;
	private double length;
	Rectangle2(double width,double length) {
		this.width = width;
		this.length = length;
		
	}
	public double getWidth(){
		return this.width;
	}
	public double getLength() {
		return this.length;
	}
	public String toString() {
		return "Rectangle[width= "+width+"],Length="
				+length;
	}
	public double getArea() { //implement getArea() method from abstract class Shape
		return this.width * this.length;
	}
}