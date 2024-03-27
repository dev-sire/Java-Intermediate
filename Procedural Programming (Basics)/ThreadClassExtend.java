class ThreadClass extends Thread{
    public void run(){
        for(int i=0; i<10; i++){
            System.out.println("Thread Class Line Number"+ i);
            try{
                Thread.sleep(100);
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}

public class ThreadClassExtend {
    public static void main(String[] args) {
        ThreadClass t1 = new ThreadClass();
        t1.start();
        for(int i=0; i<10; i++){
            System.out.println("Main Thread: "+i);
            try{
                Thread.sleep(100);
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}

