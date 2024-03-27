import java.util.HashMap;
import java.util.Scanner;

public class HashMaps {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<Integer, String> details = new HashMap<Integer, String>();
        int key;
        details.put(10,"Designer");
        details.put(11, "Programmer");
        details.put(12, "Tester");
        details.put(13, "Debugger");
        details.put(14, "Version Controller");
        details.put(15, "End-User");
        System.out.println("Enter The Key of the Employee: ");
        key = scanner.nextInt();
        if(details.containsKey(key)){
            System.out.println("The Employee Designation: "+ details.get(key));
        }else{
            System.out.println("The Key didn't match to our Hashmap");
        }
        scanner.close();
    }
}
