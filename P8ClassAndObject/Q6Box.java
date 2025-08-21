package P8ClassAndObject;
/*Create a class Box with attributes length, width, and height. Implement:
Default constructor (all = 1).
Constructor with two parameters (length, width, height = 1).Constructor with three parameters.
Use constructor chaining and the this keyword where necessary. Compute the volume of the box.*/
class Box {
    int length;
    int width;
    int height;

   
    Box() {
        this(1, 1, 1); 
    }

    Box(int length, int width) {
        this(length, width, 1); 
    }

    Box(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    int volume() {
        return length * width * height;
    }

    void display() {
        System.out.println("Length: " + length + ", Width: " + width + ", Height: " + height);
        System.out.println("Volume = " + volume());
    }
}
public class Q6Box {

	public static void main(String[] args) {
		Box b1 = new Box();
        b1.display();

        Box b2 = new Box(5, 4);
        b2.display();

        Box b3 = new Box(5, 4, 3);
        b3.display();
	}

}
