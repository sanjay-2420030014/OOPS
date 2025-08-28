package CO2_ASSIGNMENT;
/*1.	Illustrate abstraction in Java by defining an interface Payment with a method processPayment(double amount).
 *  Implement this interface in two classes, CreditCardPayment and UPIPayment, 
 *  each with its own payment processing logic. 
 * Demonstrate how to use interface references to invoke processPayment().
 * */
interface Payment {
    void processPayment(double amount);
}

class CreditCardPayment implements Payment {
    public void processPayment(double amount) {
        System.out.println("Credit Card payment of ₹" + amount + " processed.");
    }
}

class UPIPayment implements Payment {
    public void processPayment(double amount) {
        System.out.println("UPI payment of ₹" + amount + " processed.");
    }
}
public class Q1 {
	public static void main(String[] args) {
        Payment p1 = new CreditCardPayment();
        Payment p2 = new UPIPayment();

        p1.processPayment(5000);
        p2.processPayment(2000);
    }

}
