package colletionexample;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentScoreTracker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        ArrayList<Integer> arrayList = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            arrayList.add(arr[i]);
        }

        System.out.println("Elements in the ArrayList:");
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }

    }
}