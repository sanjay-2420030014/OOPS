package P8ClassAndObject;
/*Create a class Book with attributes title, author, and price. 
 * Use a parameterized constructor to initialize the data and display the book details.*/
import java.util.Scanner;

class Book {
    String title;
    String author;
    double price;

    Book(String t, String a, double p) {
        title = t;
        author = a;
        price = p;
    }

    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}

public class Q3BookDetails {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

	        System.out.print("Enter title: ");
	        String title = sc.nextLine();
	        System.out.print("Enter author: ");
	        String author = sc.nextLine();
	        System.out.print("Enter price: ");
	        double price = sc.nextDouble();

	        Book b1 = new Book(title, author, price);

	        System.out.println("\n--- Book Details ---");
	        b1.display();

	        sc.close();
	}

}
