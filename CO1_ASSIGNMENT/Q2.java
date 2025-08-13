package CO1_ASSIGNMENT;

public class Q2 {
/*Q2. Consider Strings str1, str2, and str3, given as follows: String str1 = "Hello World";
String str2 = "hello world"; String str3 = "Hello World"; 
What are the results of the following expressions? str1 == str2, str1 == str3, str1.equals(str2),
 str1.equals(str3), str1.compareTo(str2), str2.compareTo(str3). 
Provide justification for output.
*/
	public static void main(String[] args) {
		String str1 = "Hello World";
		String str2 = "hello world";
		String str3 = "Hello World";
		System.out.println("str1 == str2:"+(str1==str2));
		System.out.println("str1 == str3:"+(str1 == str3));
		System.out.println("str1.equals(str2):"+str1.equals(str2));
		System.out.println("str1.equals(str3):"+str1.equals(str3));
		System.out.println("str1.compareTo(str2):"+str1.compareTo(str2));
		System.out.println("str2.compareTo(str3):"+str2.compareTo(str3));
	}

}
