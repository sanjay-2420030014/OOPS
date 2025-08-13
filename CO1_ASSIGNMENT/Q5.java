package CO1_ASSIGNMENT;
import java.util.*;
public class Q5 {
/*Q5. Write a Java program to manage a company’s sales data using a 2D array, 
 * where each row corresponds to a salesperson and each column represents monthly sales figures for a given year. 
 * Use nested loops to calculate total annual sales and average monthly sales for each salesperson. 
 * Classify performance into categories: "Excellent", "Good", "Average", "Poor". 
 * Display a report showing monthly data, totals, averages, and performance category per salesperson.*/
	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);

	        System.out.print("Enter number of salespersons: ");
	        int salespersons = sc.nextInt();

	        int months = 12; 
	        double[][] sales = new double[salespersons][months];

	        for (int i = 0; i < salespersons; i++) {
	            System.out.println("\nEnter sales for Salesperson " + (i + 1) + ":");
	            for (int j = 0; j < months; j++) {
	                System.out.print("Month " + (j + 1) + ": ");
	                sales[i][j] = sc.nextDouble();
	            }
	        }

	        System.out.println("\n----- Sales Report -----");
	        for (int i = 0; i < salespersons; i++) {
	            double total = 0;

	            System.out.print("\nSalesperson " + (i + 1) + " - Monthly Sales: ");
	            for (int j = 0; j < months; j++) {
	                System.out.print(sales[i][j] + " ");
	                total += sales[i][j];
	            }

	            double average = total / months;

	            String performance;
	            if (average >= 80000) {
	                performance = "Excellent";
	            } else if (average >= 60000) {
	                performance = "Good";
	            } else if (average >= 40000) {
	                performance = "Average";
	            } else {
	                performance = "Poor";
	            }

	            System.out.println("\nTotal Annual Sales: " + total);
	            System.out.println("Average Monthly Sales: " + average);
	            System.out.println("Performance: " + performance);
	        }

	        sc.close();
	}

}
