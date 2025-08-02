package P4Arrays;
import java.util.Scanner;
public class Q6SmallestLargest {

	public static void main(String[] args) {
//6. program to display smallest and largest element the array of elements
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
		int n=sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter "+n  +" elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int min = arr[0];
        int max = arr[0];

        for (int i = 1; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("Smallest element: " + min);
        System.out.println("Largest element: " + max);

        sc.close();
	}

}
