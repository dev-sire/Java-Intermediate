import java.util.LinkedList;
import java.util.Queue;
 
public class Queuedemo {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);

        System.out.println("The Queue Size: "+ queue.size());
        System.out.println("The top element is: "+ queue.peek());

        while(!queue.isEmpty()){
            System.out.println("Removed Item: "+ queue.remove());
        }
    }
}