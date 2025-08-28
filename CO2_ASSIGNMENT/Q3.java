package CO2_ASSIGNMENT;
/*3.	Construct a class hierarchy in Java where a subclass uses super to call the parent class constructor, 
 * overrides a method, and invokes the parent version using super.method(). 
 * Demonstrate constructor chaining alongside method overriding.
 * */
class Parent {
    Parent() {
        System.out.println("Parent constructor");
    }
    void show() {
        System.out.println("Parent show");
    }
}

class Child extends Parent {
    Child() {
        super(); 
        System.out.println("Child constructor");
    }
    void show() {
        super.show(); 
        System.out.println("Child show");
    }
}
public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Child c = new Child();
	        c.show();
	}

}
