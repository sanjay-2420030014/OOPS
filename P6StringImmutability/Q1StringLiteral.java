package P6StringImmutability;

public class Q1StringLiteral {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "Hello";
        String str2 = str1; 

        System.out.println("str1: " + str1); 
        System.out.println("str2: " + str2);
        
        str1 = "Hi"; 

        System.out.println("str1: " + str1); 
        System.out.println("str2: " + str2); 
	}

}
