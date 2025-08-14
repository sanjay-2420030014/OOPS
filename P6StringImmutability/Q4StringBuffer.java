package P6StringImmutability;

public class Q4StringBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  StringBuffer sb = new StringBuffer("Hello World");
		 System.out.println("Original: " + sb);
	        sb.append("!!!");                     
	        System.out.println("After append: " + sb);
	        sb.insert(6, "Java ");                
	        System.out.println("After insert: " + sb);
	        sb.replace(0, 5, "Hi");               
	        System.out.println("After replace: " + sb);
	        sb.delete(3, 7);                      
	        System.out.println("After delete: " + sb);
	        sb.reverse();  
	        System.out.println("After reverse: " + sb);
	        System.out.println("Length: " + sb.length());   
	        System.out.println("Capacity: " + sb.capacity()); 
	}

}
