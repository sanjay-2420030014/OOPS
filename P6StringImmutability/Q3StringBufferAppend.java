package P6StringImmutability;

public class Q3StringBufferAppend {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer("Hello");
        System.out.println("Before append: " + sb);
        sb.append(" World");
        System.out.println("After append: " + sb);
	}

}
