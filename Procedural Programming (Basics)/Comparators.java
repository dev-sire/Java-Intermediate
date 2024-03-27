import java.util.ArrayList;
import java.util.Comparator;

class StringCompare implements Comparator<String>{
    @Override
    public int compare(String o1, String o2) {
        return o1.compareTo(o2);
    }
}
public class Comparators {
    public static void main(String[] args) {
        ArrayList<String> CityName = new ArrayList<String>();
        CityName.add("Karachi");
        CityName.add("Quetta");
        CityName.add("Lahore");
        CityName.add("Islamabad");
        CityName.add("Multan");

        System.out.println("Cities Unsorted: "+ CityName);
        CityName.sort(new StringCompare());
        System.out.println("Cities Sorted: "+ CityName);
    } 
}
