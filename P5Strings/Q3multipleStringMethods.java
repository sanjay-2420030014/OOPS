package P5Strings;
import java.util.Scanner;
public class Q3multipleStringMethods {

	public static void main(String[] args) {
//3. program to work with multiple string methods.
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        System.out.println("Original String: " + str);
        System.out.println("Length: " + str.length());
        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Lowercase: " + str.toLowerCase());
        System.out.println("First character: " + str.charAt(0));
        
        if (str.length() >= 4) {
            System.out.println("Substring (1 to 4): " + str.substring(1, 4));
        } else {
            System.out.println("String too short for substring(1,4).");
        }

        System.out.print("Enter another string to compare: ");
        String str2 = sc.nextLine();
        System.out.println("Are the strings equal? " + str.equals(str2));

     
        

        sc.close();
	}

}
