package lambdaExpression;

public class ThreadDemo {
    public static void main(String[] args) {

        // Runnable is a interface by which we can create thread. It has only one abstract method run() toh usko directly lambda se implement krdo
        Runnable thread1=()->{
            for (int i = 0; i < 1000; i++) {
                System.out.println("it is printed by "+Thread.currentThread().getName());
            }
        };

        Runnable thread2=()->{
            for (int i = 0; i < 1000; i++) {
                System.out.println("it is printed by "+Thread.currentThread().getName());
            }
        };

        Thread t1=new Thread(thread1);
        Thread t2=new Thread(thread2);

        t1.start();
        t2.start();

    }
}
