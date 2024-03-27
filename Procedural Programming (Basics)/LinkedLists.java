import java.util.LinkedList;
import java.util.ArrayList;

public class LinkedLists {
    public static void main(String[] args){
        LinkedList<Integer> intlist = new LinkedList<>();
        intlist.add(10);
        intlist.add(20);
        intlist.add(30);
        intlist.add(40);
        intlist.add(50);
        System.out.println("The Size of LinkedList: "+intlist.size()+" Content "+ intlist);

        int[] array = {120,450,340,670,560};
        ArrayList<Integer> arrList = new ArrayList<Integer>();

        for (int i : array) {
            arrList.add(i);
        }

        System.out.println("The Size of ArrayList: "+arrList.size()+" Content "+ arrList);
        intlist.addAll(2,arrList);

        System.out.println("The Size of LinkedList: "+intlist.size()+" Content "+ intlist);
    }
}
