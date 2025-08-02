package P2ControlStatements;
import java.util.Scanner;
public class Q4displayDay {
//4. Display day name based on number (1–7).
	public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter number:");
  int n=sc.nextInt();
  switch(n) {
  case 1: System.out.println("MONDAY");
  break;
  case 2: System.out.println("TUESDAY");
  break; 
  case 3: System.out.println("WEDNESDAY");
  break;
  case 4: System.out.println("THURSDAY");
  break;
  case 5: System.out.println("FRIDAY");
  break;
  case 6: System.out.println("SATURDAY");
  break;
  case 7: System.out.println("SUNDAY");
  break;
  default: System.out.println("Enter correct number(1-7)");
  }
  sc.close();
		
	}

}
