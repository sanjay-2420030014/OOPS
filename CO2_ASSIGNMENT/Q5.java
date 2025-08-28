package CO2_ASSIGNMENT;
/*5.	Explain the role of the final keyword in Java by applying it in different
 *  contexts such as variables, methods, classes, and parameters. 
 * Describe how final affects each scenario.*/
final class A {
    final int num = 10;   
    final void show() {   
        System.out.println("Final method, num = " + num);
    }
}

class Test {
    void display(final int x) { 
        System.out.println("Value of x: " + x);
    }
}
public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A obj = new A();
        obj.show();

        Test t = new Test();
        t.display(50);
	}

}
