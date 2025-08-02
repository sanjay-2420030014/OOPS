package P5Strings;
import java.util.Scanner;
public class Q1ReadStringPrint {

	public static void main(String[] args) {
//1. program to read string value and print it on the console
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();  

        System.out.println("You entered: " + input);

        sc.close();

	}

}
