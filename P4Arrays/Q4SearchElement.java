package P4Arrays;

import java.util.Scanner;

public class Q4SearchElement {

	public static void main(String[] args) {
//4. program to search for an element among given elements
		Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];
        System.out.println("Enter 5 elements:");
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter element to search: ");
        int key = sc.nextInt();

        boolean found = false;
        for (int i = 0; i < 5; i++) {
            if (arr[i] == key) {
                System.out.println("Element " + key + " found at position " + (i + 1));
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Element not found.");
        }
        sc.close();
	}

}
