package CO1_ASSIGNMENT;
import java.util.*;
public class Q3 {
/*Q3. Write a Java program that takes a string input representing a temperature in Celsius (e.g., "36.5")
 *  and Converts it to float and double using type conversion.
 *   Converts it to int using explicit casting (truncate decimal).Displays all three forms.*/
	public static void main(String[] args) {
        Scanner sc =new Scanner (System.in);
        System.out.println("Enter temprature:");
        String tempStr = sc.nextLine();
        float tempFloat = Float.parseFloat(tempStr);
        int tempInt =(int)tempFloat;
        
        System.out.println("Given Temperature:"+tempStr);
        	System.out.println("Temperature as float:"+tempFloat);
        System.out.println("Temperature as int:"+tempInt);
        sc.close();
	}
	

}
