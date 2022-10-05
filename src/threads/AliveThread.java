package threads;

public class AliveThread implements Runnable {
    @Override
    public void run() {
        System.out.println("Hello, I am alive! :D");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
