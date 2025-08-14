package P6StringImmutability;

public class Q2StringEqual {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = new String("Hello");
        String str2 = new String("Hello");

        System.out.println("str1 == str2: " + (str1 == str2));      
        System.out.println("str1.equals(str2): " + str1.equals(str2)); 
	}

}
