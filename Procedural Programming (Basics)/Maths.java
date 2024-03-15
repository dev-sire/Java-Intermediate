public class Maths {
    public static void main(String[] args){
        // some variables to work with
        double x = 3.1412;
        double y = -10;

        //Max/Min method

        System.out.println(Math.max(x, y));
        System.out.println(Math.min(x, y));

        //Absolute Value

        System.out.println(Math.abs(y));

        //Square Root Of a function

        System.out.println(Math.sqrt(Math.abs(y)));

        // Floor/Ceiling & Round off 

        System.out.println(Math.ceil(x));
        System.out.println(Math.floor(x));
        System.out.println(Math.round(x));
    }
}
