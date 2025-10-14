package CO3_ASSIGNMENT;
import java.util.*;
import java.util.function.*;


/*4.	In a GUI application, you handle button clicks and data filtering using lambdas. Use a Predicate lambda to 
 * filter strings longer than 5 characters from a list.Then, apply a Consumer lambda to print each filtered item. 
 * Write the code integrating these functional interfaces and explain how lambda expressions simplify code 
 * compared to anonymous classes, including their role in functional programming.*/
public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        List<String> words = Arrays.asList("hello", "java", "programming", "chatgpt", "ai", "stream");

        Predicate<String> longerThanFive = s -> s.length() > 5;

        Consumer<String> printWord = word -> System.out.println("Filtered word: " + word);

        words.stream()
             .filter(longerThanFive)  
             .forEach(printWord);     

	}

}
