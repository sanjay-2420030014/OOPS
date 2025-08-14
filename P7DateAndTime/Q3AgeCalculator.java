package P7DateAndTime;
import java.util.Scanner;
import java.time.*;
public class Q3AgeCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter birth year: ");
        int y = sc.nextInt();
        System.out.print("Enter birth month: ");
        int m = sc.nextInt();
        System.out.print("Enter birth day: ");
        int d = sc.nextInt();

        LocalDate birth = LocalDate.of(y, m, d);
        LocalDate today = LocalDate.now();
        Period age = Period.between(birth, today);

        System.out.println("Age: " + age.getYears() + " years, " + age.getMonths() + " months, " + age.getDays() + " days");
	}

}
