class MyThread implements Runnable{
    @Override
    public void run() {
        for(int i=0; i<10; i++){
            System.out.println("Thread Number: "+Thread.currentThread().getId()+" Line: "+i);
        }
    }
    
}
public class ThreadWithRunnable {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new MyThread());
        Thread thread2 = new Thread(new MyThread());

        thread1.start();
        thread2.start();

        for(int i=0; i<10; i++){
            System.out.println("Main Thread Line: "+i);
        }
    }
}
