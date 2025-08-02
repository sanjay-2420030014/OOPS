package P4Arrays;
import java.util.Scanner;
public class Q5RemoveDuplicatePrint {

	public static void main(String[] args) {
//5. program to remove duplicate elements and print the unique elements
		Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];
        int[] unique = new int[10];
        int count = 0;

        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < count; j++) {
                if (arr[i] == unique[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                unique[count] = arr[i];
                count++;
            }
        }

        System.out.println("Unique elements:");
        for (int i = 0; i < count; i++) {
            System.out.println(unique[i]);
        }

        sc.close();
	}

}
