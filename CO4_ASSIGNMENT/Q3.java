package CO4_ASSIGNMENT;

/**
3. Design a social media platform with a HashSet<User> to store unique users by email,
   create a custom checked UserAlreadyExistsException extending Exception,
   implement an addUser(User user) method that throws this exception if the user exists
   (overriding equals/hashCode in User for email), adds the user otherwise,
   use try-catch in a signup scenario to handle duplicates with "User exists" message,
   and list all unique users in finally.
*/

import java.util.*;

class User {
    String email;

    User(String email) {
        this.email = email;
    }

    
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof User))
            return false;
        User user = (User) obj;
        return email.equalsIgnoreCase(user.email);
    }

    @Override
    public int hashCode() {
        return email.toLowerCase().hashCode();
    }

    @Override
    public String toString() {
        return email;
    }
}

class UserAlreadyExistsException extends Exception {
    
	private static final long serialVersionUID = 1L;

	public UserAlreadyExistsException(String message) {
        super(message);
    }
}

public class Q3 {
    HashSet<User> users = new HashSet<>();

    void addUser(User user) throws UserAlreadyExistsException {
        if (users.contains(user))
            throw new UserAlreadyExistsException("User already exists");
        users.add(user);
    }

    public static void main(String[] args) {
        Q3 platform = new Q3();

        try {
            platform.addUser(new User("alice@gmail.com"));
            platform.addUser(new User("bob@gmail.com"));
            platform.addUser(new User("alice@gmail.com")); // duplicate
        } catch (UserAlreadyExistsException e) {
            System.out.println("User exists");
        } finally {
            System.out.println("All users: " + platform.users);
        }
    }
}
