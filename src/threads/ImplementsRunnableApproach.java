package threads;

public class ImplementsRunnableApproach implements Runnable {

    private int threadNumber;

    public ImplementsRunnableApproach(int threadNumber) {
        this.threadNumber = threadNumber;
    }

    @Override
    public void run() {

        for (int i = 0; i < 3; i++) {
            System.out.println("Thread " + threadNumber + " says " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
