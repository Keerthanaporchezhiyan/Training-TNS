package newpack.inherit;

public class Rectangle {
    private int length;
    private int breadth;

    // Constructor
    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // Getter and Setter for length
    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    // Getter and Setter for breadth
    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    // Method to calculate area
    public void area() {
        int area = length * breadth;
        System.out.println("Area of rect: " + area);
    }

    // Method to calculate perimeter
    public void perimeter() {
        int peri = 2 * (length + breadth);
        System.out.println("Perimeter of rect: " + peri);
    }
}
