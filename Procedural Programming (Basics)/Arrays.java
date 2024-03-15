import java.util.Scanner;

public class Arrays {
    public static void main(String[] args){
        // Array initialization : An example program
        String[] Cars = new String[3];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Any 3 of your favourite Cars");
        Cars[0] = scanner.nextLine();
        Cars[1] = scanner.nextLine();
        Cars[2] = scanner.nextLine();

        for(int i=0; i<Cars.length; i++){
            System.out.println("You Entered: "+Cars[i]);
        }
        
        scanner.close();
    }
}
