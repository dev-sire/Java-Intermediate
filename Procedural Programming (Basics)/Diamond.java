import java.util.Scanner;

public class Diamond {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter Max Width: ");
        int number = obj.nextInt();
        int m, n;
        for(m=1; m<number; m++){
            for(n = 1; n < number - m; n++){
                System.out.print(" ");
            }
            for(n = 1; n <= m*2-1; n++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(m = number - 1; m > 0; m--){
            for(n = 1; n < number - m; n++){
                System.out.print(" ");
            }
            for(n = 1; n <= m*2-1; n++){
                System.out.print("*");
            }
            System.out.println();
        }
    obj.close();
    }
}
