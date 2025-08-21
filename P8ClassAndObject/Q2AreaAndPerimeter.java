package P8ClassAndObject;
import java.util.Scanner;

class Rectangle {
    int length;
    int breadth;

    Rectangle(int le, int br) {
        length = le;
        breadth = br;
    }

    int area() {
        return length * breadth;
    }

    int perimeter() {
        return 2 * (length + breadth);
    }
}

public class Q2AreaAndPerimeter {
/* Write a class Rectangle with data members length and breadth. 
 * Add methods to calculate and return the area and perimeter.*/
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter length: ");
        int l = sc.nextInt();
        System.out.print("Enter breadth: ");
        int b = sc.nextInt();

        Rectangle rect = new Rectangle(l, b);

        System.out.println("Area = " + rect.area());
        System.out.println("Perimeter = " + rect.perimeter());

        sc.close();
	}

}
