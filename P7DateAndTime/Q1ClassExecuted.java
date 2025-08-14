package P7DateAndTime;
import java.time.*;
import java.time.format.DateTimeFormatter;
public class Q1ClassExecuted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate today = LocalDate.now();
        LocalDate specificDate = LocalDate.of(1999, 3, 1);

        System.out.println("Today: " + today);
        System.out.println("Specific Date: " + specificDate);

        
        LocalTime now = LocalTime.now();
        LocalTime time1 = LocalTime.of(9, 0);   
        LocalTime time2 = LocalTime.of(20, 30); 

        System.out.println("Current Time: " + now);
        System.out.println("Time1: " + time1);
        System.out.println("Time2: " + time2);

        Duration diff = Duration.between(time1, time2);
        System.out.println("Total hours: " + diff.toHours());
        System.out.println("Total minutes: " + diff.toMinutes());

        LocalDateTime dateTimeNow = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        System.out.println("Formatted DateTime: " + dateTimeNow.format(formatter));
	}

}
