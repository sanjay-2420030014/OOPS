package CO4_ASSIGNMENT;

/**
2. Create a document management tool to access files from a network drive,
   managing both checked exceptions (IOException) and unchecked exceptions (NullPointerException).
   Define a readFile(String path) method that throws IOException if the file is absent,
   invoke it with try-catch to catch IOException and print "File not found",
   allowing unchecked exceptions to propagate, and simulate a null path to trigger it.
*/

import java.io.*;

public class Q2 {

    void readFile(String path) throws IOException {
        if (path == null)
            throw new NullPointerException("Path is null");

        File file = new File(path);
        if (!file.exists())
            throw new IOException("File not found");

        System.out.println("File accessed successfully: " + path);
    }

    public static void main(String[] args) throws IOException {
        Q2 manager = new Q2();

        try {
            manager.readFile("C:\\invalidpath\\doc.txt"); // checked exception
        } catch (IOException e) {
            System.out.println("File not found");
        }

        try {
            manager.readFile(null); // unchecked exception handled
        } catch (NullPointerException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
