package P7DateAndTime;
import java.time.LocalDate;
import java.util.Scanner;
public class Q5Add30Sub60 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner sc = new Scanner(System.in);
	        System.out.print("Enter year: ");
	        int y = sc.nextInt();
	        System.out.print("Enter month: ");
	        int m = sc.nextInt();
	        System.out.print("Enter day: ");
	        int d = sc.nextInt();

	        LocalDate date = LocalDate.of(y, m, d);
	        System.out.println("Original date: " + date);
	        System.out.println("After 30 days: " + date.plusDays(30));
	        System.out.println("60 days before: " + date.minusDays(60));
	        sc.close();
	}

}
