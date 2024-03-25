import java.util.HashSet;
import java.util.Set;

public class Sets {
    public static void main(String[] args){
        int [] list1 = {1,5,2,6,5,2,12};
        int [] list2 = {12,4,3,2,4,15};
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for (int item : list1) {
            set1.add(item);
        }
        for (int  item : list2) {
            set2.add(item);
        }
        System.out.println("The first set: "+set1);
        System.out.println("The second Set: "+ set2);

        // Union of two sets
        Set<Integer> union = new HashSet<Integer>(set1);
        union.addAll(set2);
        System.out.println("The union is: "+union);

        //Intersection of two sets
        Set<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);
        System.out.println("The Intersection is: "+ intersection);

        //Difference of two sets
        Set<Integer> diff = new HashSet<>(set1);
        diff.removeAll(set2);
        System.out.println("The difference is: "+diff);
    }
}
