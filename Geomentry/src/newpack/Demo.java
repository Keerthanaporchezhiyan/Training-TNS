package newpack;
import newpack.geomentry.*;

public class Demo {
	    public static void main(String[] args) {
	        // Circle
	        Circle circle = new Circle(5);
	        System.out.println("Circle:");
	        System.out.println("Radius: 5");
	        System.out.println("Area: " + circle.getArea());
	        System.out.println("Perimeter: " + circle.getPerimeter());
	        System.out.println();

	        // Rectangle
	        Rectangle rectangle = new Rectangle(4, 7);
	        System.out.println("Rectangle:");
	        System.out.println("Length: 4, Width: 7");
	        System.out.println("Area: " + rectangle.getArea());
	        System.out.println("Perimeter: " + rectangle.getPerimeter());
	        System.out.println();

	        // Triangle
	        Triangle triangle = new Triangle(3, 4, 5);
	        System.out.println("Triangle:");
	        System.out.println("Sides: 3, 4, 5");
	        System.out.println("Area: " + triangle.getArea());
	        System.out.println("Perimeter: " + triangle.getPerimeter());
	    }

}
