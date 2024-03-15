import java.util.ArrayList;

public class ForEach {
    public static void main(String[] args){
        
      // For-Each: a traversing technique to iterate through the elements in an array/collection
      //            -- it makes code more readable, and efficient
      //            -- it is less flexible

      // For arrays

      String[] animals = {"Cats","Dogs","Birds","Fish","Elephant"};
      for (String i : animals) {
        System.out.println("Elements in the Array: "+i);
      }
      //For ArrayLists

      ArrayList<String> students = new ArrayList<String>();
      students.add("Aman");
      students.add("Wajahat");
      students.add("Sameer");
      students.add("Subhan");
      students.add("Akbar");

      for (String i : students) {
        System.out.println("Elements in the ArrayList: "+i);
      }

    }
}
