package CO2_ASSIGNMENT;
/*4.	Create two classes, Address and Employee, to demonstrate aggregation by 
 * assigning an existing Address object to an Employee, 
 * and composition by creating an Address object within the Employee class itself.*/
class Address {
    String city;
    Address(String city) {
        this.city = city;
    }
}


class EmployeeAgg {
    Address address; 
    EmployeeAgg(Address address) {
        this.address = address;
    }
    void show() {
        System.out.println("Lives in " + address.city);
    }
}


class EmployeeComp {
    Address address; 
    EmployeeComp(String city) {
        this.address = new Address(city); 
    }
    void show() {
        System.out.println("Lives in " + address.city);
    }
}
public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Address addr = new Address("Hyderabad");

	        EmployeeAgg e1 = new EmployeeAgg(addr); 
	        e1.show();

	        EmployeeComp e2 = new EmployeeComp("Chennai"); 
	        e2.show();
	}

}
