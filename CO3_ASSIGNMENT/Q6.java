package CO3_ASSIGNMENT;
import java.util.*;
/*6.	In a project management app, tasks need to be stored and manipulated efficiently. Compare ArrayList and
 *  LinkedList in terms of performance for adding/removing elements. Write code to use a LinkedList for tasks 
 *  that are frequently inserted/deleted, and convert it to a HashSet to remove duplicates. Explain why HashSet
 *   is suitable here and demonstrate adding elements while handling potential null values.*/
public class Q6 {
	public static void main(String[] args) {
        LinkedList<String> tasks = new LinkedList<>();

        tasks.add("Design UI");
        tasks.add("Write Code");
        tasks.add("Test Module");
        tasks.add("Write Code"); 
        tasks.add(null);         
        tasks.add("Deploy");

        System.out.println("Original LinkedList with duplicates and null:");
        System.out.println(tasks);

        Set<String> uniqueTasks = new HashSet<>();
        for (String task : tasks) {
            if (task != null) { 
                uniqueTasks.add(task);
            }
        }

        System.out.println("\nUnique tasks (duplicates removed, null ignored):");
        System.out.println(uniqueTasks);

        uniqueTasks.add("Write Code"); 
        uniqueTasks.add("Document API"); 

        System.out.println("\nFinal task set after adding more tasks:");
        System.out.println(uniqueTasks);
    }

}
