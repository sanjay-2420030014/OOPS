package CO3_ASSIGNMENT;
import java.util.*;
import java.util.stream.*;
/*1.	In a retail analytics system, you have a list of sales transactions with attributes like product, amount, 
 * and category. Use the Stream API to filter transactions above $100, map to extract amounts, and reduce to 
 * calculate the total sum. Write the code and explain each operation (filter, map, reduce). Extend it to collect
 *  results into a List and discuss how streams improve code readability over traditional loops.*/

class Transaction {
    String product;
    double amount;
    String category;

    Transaction(String product, double amount, String category) {
        this.product = product;
        this.amount = amount;
        this.category = category;
    }
}
public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        List<Transaction> transactions = Arrays.asList(
            new Transaction("Shirt", 80, "Clothing"),
            new Transaction("Laptop", 1200, "Electronics"),
            new Transaction("Shoes", 150, "Footwear"),
            new Transaction("Book", 50, "Stationery"),
            new Transaction("Watch", 300, "Accessories")
        );

        List<Transaction> filtered = transactions.stream()
            .filter(t -> t.amount > 100)
            .collect(Collectors.toList());

        List<Double> amounts = filtered.stream()
            .map(t -> t.amount)
            .collect(Collectors.toList());

        double total = amounts.stream()
            .reduce(0.0, (sum, amt) -> sum + amt);

        System.out.println("Transactions above $100: " + amounts);
        System.out.println("Total Sales (above $100): $" + total);
			
	}

}
