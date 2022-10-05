package threads;

import java.util.concurrent.TimeUnit;

public class MainThread {
    public static void main(String[] args) throws InterruptedException {

//        System.out.println("Exercise no 1: Observing Multi-Thread behaviour");
//        for (int i = 0; i < 3; i++) {
//            var thread = new ExtendsThreadApproach(i);
//            thread.start();
//        }
//
//        System.out.println("Exercise no 2: Observing Threads running synchronously");
//        for (int i = 0; i < 3; i++) {
//            var thread = new ExtendsThreadApproach(i);
//            thread.run();
//        }
//
//        System.out.println("Exercise no 3: Implementing Runnable Approach");
//        for (int i = 0; i < 3; i++) {
//            var runnableClass = new ImplementsRunnableApproach(i);
//            var thread = new Thread(runnableClass);
//            thread.start();
//        }
//
//        System.out.println("Exercise no 4: Checking if the Thread is alive");
//        var aliveThread = new AliveThread();
//        var thread = new Thread(aliveThread);
//
//        {
//            thread.start();
//            TimeUnit.SECONDS.sleep(1);
//            System.out.println(thread.isAlive());
//        }

        System.out.println("Exercise no 5: Thread should be dead after execution");
        var deadThread = new AliveThread();
        var thread = new Thread(deadThread);

        {
            thread.start();
            TimeUnit.SECONDS.sleep(4);
            System.out.println(thread.isAlive());
        }
    }
}
