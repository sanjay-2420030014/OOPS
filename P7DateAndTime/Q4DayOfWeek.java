package P7DateAndTime;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class Q4DayOfWeek {

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
        DayOfWeek day = date.getDayOfWeek();
        System.out.println("Day of the week: " + day);
	}

}
