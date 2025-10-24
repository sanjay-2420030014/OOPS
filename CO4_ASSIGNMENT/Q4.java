package CO4_ASSIGNMENT;

/**
4. Develop a database connection pool for a web application ensuring connections close even on errors,
   create a queryDatabase() method that simulates opening a connection (in try),
   performs a query that may throw a SQLException (checked),
   catches it to log "Query failed", and uses finally to close the connection,
   test with a failed query to confirm finally executes.
*/

import java.sql.SQLException;

public class Q4 {

    void queryDatabase() {
        System.out.println("Opening database connection...");
        try {
            // simulate query failure
            throw new SQLException("Query failed");
        } catch (SQLException e) {
            System.out.println("Query failed");
        } finally {
            System.out.println("Connection closed");
        }
    }

    public static void main(String[] args) {
        Q4 db = new Q4();
        db.queryDatabase();
    }
}
