import java.util.Arrays;
import java.util.Enumeration;
import java.util.LinkedList;
import java.util.Vector;
import java.util.Iterator;

public class IteratorsEnum {
    public static void main(String[] args) {
        String[] wordArr = {"Book","Number","Lemon","Place","Apple","Tree"};
        Vector<String> wordList = new Vector<String>(Arrays.asList(wordArr));
        System.out.println("\n The Word List: \n"+ wordList+"\n");
        Enumeration<String> vectorEnum = wordList.elements();
        while (vectorEnum.hasMoreElements()) {
            System.out.println(vectorEnum.nextElement());
        }
        LinkedList<String> wordLinkedList = new LinkedList<>();
        wordLinkedList.addAll(wordList);
        wordLinkedList.add("Ball");
        wordLinkedList.add("Mango");
        System.out.println("The Elements Word Linked List: \n"+ wordLinkedList+"\n");
        Iterator<String> it = wordLinkedList.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
