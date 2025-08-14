package P6StringImmutability;
import java.util.Scanner;
public class Q5ReverseLastName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        System.out.print("Enter full name: ");
	        String fullName = sc.nextLine();

	        int spaceIndex = fullName.lastIndexOf(' '); 
	        if(spaceIndex == -1){
	            System.out.println("No last name found.");
	        } else {
	            String firstName = fullName.substring(0, spaceIndex + 1);
	            String lastName = fullName.substring(spaceIndex + 1);

	            StringBuffer sb = new StringBuffer(lastName);
	            sb.reverse();

	            System.out.println("Modified name: " + firstName + sb);
	            sc.close();
	}

	}
}
