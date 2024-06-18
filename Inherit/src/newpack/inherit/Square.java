package newpack.inherit;

public class Square extends Rectangle {
    private int side;

    // Constructor to initialize the side of the square
    public Square(int side) {
        super(side, side); // Call the Rectangle constructor
        this.side = side;
    }

    // Method to calculate the area of the square
    public void areas() {
        int area = side * side;
        System.out.println("Area of square: " + area);
    }

    // Main method to test the Square class
    public static void main(String[] args) {
        Square s = new Square(73);
        s.areas();
        s.area(); // Use the Rectangle's area method
        s.perimeter(); // Use the Rectangle's perimeter method
    }
}
