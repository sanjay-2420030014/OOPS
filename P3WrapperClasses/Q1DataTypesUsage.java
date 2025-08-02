package P3WrapperClasses;

public class Q1DataTypesUsage {

	public static void main(String[] args) {
		//1.Wrapper Classes
     // AUTO BOXING
		int a=10;
		Integer i = a;
	 System.out.println("a="+a);
	 System.out.println("i="+i);
    //AUTO-UNBOXING
	 int b=i;
	 System.out.println("b="+b);
	 //BOXING
	 int c=5;
	 Integer j = Integer.valueOf(c);
	 System.out.println("c="+c);
	 System.out.println("j="+j);

	}

}
