package P7DateAndTime;
import java.time.*;
public class Q2TodaysDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate today = LocalDate.now();
        LocalDate endOfYear = LocalDate.of(today.getYear(), 12, 31);
        long daysRemaining = Duration.between(today.atStartOfDay(), endOfYear.plusDays(1).atStartOfDay()).toDays();

        System.out.println("Today's date: " + today);
        System.out.println("Last date of the year: " + endOfYear);
        System.out.println("Days remaining in the year: " + daysRemaining);
	}

}
