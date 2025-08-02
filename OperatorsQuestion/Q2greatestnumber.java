package OperatorsQuestion;
import java.util.Scanner;
public class Q2greatestnumber {
	//2.Compare two integers and display which one is greater or if they are equal
    public static void main(String[] args) {
    	Scanner sc= new Scanner(System.in);
    	System.out.println("Enter any two numbers:");
    	int a = sc.nextInt();
    	int b= sc.nextInt();
        if(a>b) {
        	System.out.print("Greatest number is:");
    			System.out.print(a);
        }
    	else if(a<b) {
    		System.out.print("Greatest number is:");
    			System.out.print(b);
    		}
        else if(a==b) {
        	System.out.print("Both are equal");
        }
      
        sc.close();
    }
}
