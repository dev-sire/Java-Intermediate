public class OverloadedMethods {
    public static void main(String[] args){

        // Overloaded Methods: Methods that share the same name but have different Parameters
        // THIS IS ALLOWED BECAUSE: Every method is recognized by it's signature which is given as 
        // Method Signature = Method Name + Method Parameters

        //Number of parameters will determine which method will be invoked!
        int x = add(7, 5,6,7);
        System.out.println(x);

        double y = add(0.5666664, 12.5677856);
        System.out.println(y);
    }

    static int add(int a, int b){
        System.out.println("This is Overloaded Method #1");
        return a+b;
    }
    static int add(int a, int b, int c){
        System.out.println("This is Overloaded Method #2");
        return a+b+c;
    }
    static int add(int a, int b, int c, int d){
        System.out.println("This is Overloaded Method #3");
        return a+b+c+d;
    }
    static double add(double a, double b){
        System.out.println("This is Overloaded Method #1 of Double DataType");
        return a+b;
    }
    static double add(double a, double b, double c){
        System.out.println("This is Overloaded Method #2 of Double DataType");
        return a+b+c;
    }
    static double add(double a, double b, double c, double d){
        System.out.println("This is Overloaded Method #3 of Double DataType");
        return a+b+c+d;
    }
}
