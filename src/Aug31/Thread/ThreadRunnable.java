package Aug31.Thread;

public class ThreadRunnable {
    public static void main(String[] args) {


        Thread thread = new Thread(() -> System.out.println("Thread is running!"));
        thread.start();
    }
}
