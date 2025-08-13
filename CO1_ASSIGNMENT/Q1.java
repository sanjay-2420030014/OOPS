package CO1_ASSIGNMENT;
import java.time.Duration;
import java.time.LocalTime;
import java.util.Scanner;
public class Q1 {
/*Q1. A company tracks daily clock-ins as pairs HH:mm start, HH:mm end. 
Write a Java program using LocalTime and Duration to compute total hours worked for the day. 
Treat end earlier than start as next-day finish */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter start time (HH:mm): ");
        String startStr = sc.nextLine();

        System.out.print("Enter end time (HH:mm): ");
        String endStr = sc.nextLine();

        LocalTime start = LocalTime.parse(startStr);
        LocalTime end = LocalTime.parse(endStr);


         long minutesWorked = Duration.between(start, end).toMinutes();

        if (minutesWorked < 0) {
            minutesWorked += 24 * 60; 
        }

        long hours = minutesWorked / 60;
        long minutes = minutesWorked % 60;

        System.out.println("Total worked time: " + hours + " hours and " + minutes + " minutes.");

        sc.close();
	}

}
