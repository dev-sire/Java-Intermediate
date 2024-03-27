import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptions {

    // Exception: an event that occurs during the execution of program that disrupts the flow of instructons
     
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        try{
            System.out.println("Enter a whole number to divide: ");
            int x = scanner.nextInt();
    
            System.out.println("Enter a whole number to divide by: ");
            int y = scanner.nextInt();
    
            int z = x/y;
            System.out.println("Result: "+ z);
        }
        catch(ArithmeticException e){
            System.out.println("BARA KEERA HEIN ZERO SE DIVIDE KARNE KA?");
        }
        catch(InputMismatchException e){
            System.out.println("Enter a Valid Integar!!");
        }
        catch(Exception e){
            System.out.println("Something went Wrong");
        }
        finally{
            scanner.close();
        }
    }   
}
