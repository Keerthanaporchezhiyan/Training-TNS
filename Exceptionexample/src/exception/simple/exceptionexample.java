package exception.simple;
import java.util.Scanner;

public class exceptionexample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, result;
        System.out.print("Enter the value for a: ");
        a = scanner.nextInt();
        
        System.out.print("Enter the value for b: ");
        b = scanner.nextInt();
        
        try {
            result = a / b;
            System.out.println("The result is: " + result);
        } catch (Exception e) {
            System.out.println("Division not allowded");
        }
    }
}
