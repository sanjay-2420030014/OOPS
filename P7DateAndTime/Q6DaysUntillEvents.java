package P7DateAndTime;
import java.time.LocalDate;
import java.util.Scanner;
public class Q6DaysUntillEvents {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter event year: ");
        int y = sc.nextInt();
        System.out.print("Enter month: ");
        int m = sc.nextInt();
        System.out.print("Enter day: ");
        int d = sc.nextInt();

        LocalDate event = LocalDate.of(y, m, d);
        LocalDate today = LocalDate.now();
        long days = event.toEpochDay() - today.toEpochDay();

        if(days > 0) System.out.println("Event in " + days + " days");
        else if(days < 0) System.out.println("Event was " + (-days) + " days ago");
        else System.out.println("Event is today!");
        sc.close();
	}

}
