package exceptionquesion;

public class CatchExcerise {

	public static void main(String[] args) {
        try {
            int[] a = new int[5];
            a[5] = 30 / 5;  // This line will throw ArrayIndexOutOfBoundsException
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException");
        }
    }

}

