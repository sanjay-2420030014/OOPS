package CO4_ASSIGNMENT;

/**
5. Design a “ReportGenerator” program employing three worker threads to calculate partial statistics
   (sales, revenue, feedback), ensuring the main thread displays the final report only after all threads complete,
   using join() for proper sequencing.
*/

public class Q5 {

    static class Worker extends Thread {
        private String taskName;

        Worker(String taskName) {
            this.taskName = taskName;
        }

        public void run() {
            System.out.println(taskName + " calculation started...");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(taskName + " calculation completed.");
        }
    }

    public static void main(String[] args) {
        Worker sales = new Worker("Sales");
        Worker revenue = new Worker("Revenue");
        Worker feedback = new Worker("Feedback");

        sales.start();
        revenue.start();
        feedback.start();

        try {
            sales.join();
            revenue.join();
            feedback.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final report generated after all threads completed.");
    }
}
