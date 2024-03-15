public class SwapVariables {
    public static void main(String[] args){
        String x = "Aman";
        String y = "Shahid";
        String temp;

        temp = x;
        x = y;
        y = temp;

        System.out.println("X = "+ x);
        System.out.println("Y = "+ y);
    }
}
