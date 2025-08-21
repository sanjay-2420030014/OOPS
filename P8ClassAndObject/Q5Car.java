package P8ClassAndObject;
/* Create a class Car with three constructors:
Default constructor (brand = "Unknown", price = 0).
Constructor with one parameter (brand).
Constructor with two parameters (brand, price).
Use constructor chaining with this() to avoid code duplication and display details.*/
class Car {
    String brand;
    double price;

    Car() {
        this("Unknown", 0); 
    }

    Car(String brand) {
        this(brand, 0);  
    }

    Car(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    void display() {
        System.out.println("Brand: " + brand + ", Price: " + price);
    }
}
public class Q5Car {

	public static void main(String[] args) {
		Car c1 = new Car();
        c1.display();

        Car c2 = new Car("Toyota");
        c2.display();

        Car c3 = new Car("BMW", 5500000);
        c3.display();
	}

}
