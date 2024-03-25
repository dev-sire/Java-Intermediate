import java.util.Stack;

public class Stacks {
    public static void main(String[] args){
        Stack<Integer> myStack = new Stack<>();

        myStack.push(10);
        myStack.push(20);
        myStack.push(30);
        myStack.push(40);
        myStack.push(50);

        System.out.println("The size is: "+ myStack.size());
        System.out.println("The top element is: "+ myStack.peek());
        
        while(!myStack.isEmpty()){
            System.out.println("Popped item: "+ myStack.pop());
        }
        System.out.println("The size is: "+ myStack.size());

    }
}
