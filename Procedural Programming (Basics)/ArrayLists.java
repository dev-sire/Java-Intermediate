import java.util.ArrayList;

public class ArrayLists {
    public static void main(String[] args){

        // ArrayLists: It is an resizable array, which means elements can added or removed after compilation phase
        // NOTE: It Stores Reference DataType Variables

        ArrayList<String> food = new ArrayList<String>();

        // Add Method: Adds to the Array list
        food.add("Biryani");
        food.add("Pizza");
        food.add("Pasta");

        // Set Method: Replaces an element at the given index with another element 
        food.set(0, "Korma");

        // Remove Method: Removes an Element at the given index
        food.remove(2);

        // Clear Method: Clears All the Elements present in an Array
        food.clear();

        for (int i=0; i<food.size(); i++) {
            System.out.println(food.get(i));
        }
    }
}
