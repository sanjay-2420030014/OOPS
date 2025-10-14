package CO3_ASSIGNMENT;
/*5.	Consider an online shopping platform where orders can fail due to insufficient stock or invalid payment
 *  details. Create a custom exception class OrderProcessingException that extends a checked exception. 
 *  Demonstrate its usage in a method that processes an order, using throw to raise the exception when 
 *  conditions are not met. Include try-catch blocks to handle it and explain the difference between checked and
 *   unchecked exceptions in this context.*/

class OrderProcessingException extends Exception {
    public OrderProcessingException(String message) {
        super(message); 
    }
}

class Order {
    String productName;
    int quantityAvailable;
    boolean paymentValid;

    public Order(String productName, int quantityAvailable, boolean paymentValid) {
        this.productName = productName;
        this.quantityAvailable = quantityAvailable;
        this.paymentValid = paymentValid;
    }
}
public class Q5 {
	 public static void processOrder(Order order, int orderQuantity) throws OrderProcessingException {

	        if (orderQuantity > order.quantityAvailable) {
	            throw new OrderProcessingException("Order failed: Insufficient stock for " + order.productName);
	        }

	        if (!order.paymentValid) {
	            throw new OrderProcessingException("Order failed: Invalid payment details.");
	        }

	        System.out.println("Order processed successfully for " + order.productName);
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Order order1 = new Order("Laptop", 5, true);
        Order order2 = new Order("Phone", 0, true);
        Order order3 = new Order("Headphones", 10, false);

        try {
            processOrder(order1, 3); 
            processOrder(order2, 1); 
            processOrder(order3, 2); 
        } 
        catch (OrderProcessingException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        System.out.println("Program continues normally...");

	}

}
