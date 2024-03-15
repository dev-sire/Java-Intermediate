import java.util.Scanner;

public class Hyp {
    public static void main(String[] args){
        // Program to find the Hypotenous of a triangle
        Scanner obj = new Scanner(System.in);
        double x, y, z;
        System.out.println("Enter Base: ");
        x = obj.nextDouble();
        System.out.println("Enter Perpendicular: ");
        y = obj.nextDouble();
        z = Math.sqrt((x*x)+(y*y));
        System.out.println("The Hypotenous is: "+z);
        obj.close();
    }
}
