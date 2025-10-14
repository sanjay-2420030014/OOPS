package CO3_ASSIGNMENT;
import java.util.*;
/*3.	Design a simple chat application where messages are queued for delivery and user IDs map to their 
 * message histories. Use a HashMap> to store user-message pairs and a Queue (implemented with LinkedList) for
 *  pending messages. Write code to enqueue messages, dequeue them for processing, and retrieve a user's history 
 *  from the map. Discuss the time complexity of key operations in HashMap and why Queue is appropriate for FIFO 
 *  processing.*/

class ChatApp {
    private Map<String, List<String>> userMessages = new HashMap<>();

    private Queue<String> messageQueue = new LinkedList<>();

    public void enqueueMessage(String userId, String message) {
        messageQueue.add(userId + ": " + message); 
        System.out.println("Message queued: " + message);
    }

    public void processNextMessage() {
        if (messageQueue.isEmpty()) {
            System.out.println("No pending messages to process.");
            return;
        }

        String msg = messageQueue.poll();

        String[] parts = msg.split(": ", 2);
        String userId = parts[0];
        String message = parts[1];

        userMessages.putIfAbsent(userId, new ArrayList<>());
        userMessages.get(userId).add(message);

        System.out.println("Processed message from " + userId + ": " + message);
    }

    public void getUserHistory(String userId) {
        List<String> history = userMessages.get(userId);
        if (history == null || history.isEmpty()) {
            System.out.println("No messages found for user: " + userId);
        } else {
            System.out.println("Message history of " + userId + ": " + history);
        }
    }
}
public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  ChatApp chat = new ChatApp();

	        chat.enqueueMessage("user1", "Hello!");
	        chat.enqueueMessage("user2", "Hi there!");
	        chat.enqueueMessage("user1", "How are you?");

	        System.out.println();

	        chat.processNextMessage();
	        chat.processNextMessage();
	        chat.processNextMessage();

	        System.out.println();

	        chat.getUserHistory("user1");
	        chat.getUserHistory("user2");

	}

}
