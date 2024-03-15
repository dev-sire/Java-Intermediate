public class Wrapper {
    public static void main(String[] args){

        // Autoboxing: The automatic conversion that that the java compiler makes between the primitive datatype and their corresponding Object Wrapper Class
        // Unboxing: The reverse of Autoboxing. Automatic conversion of wrapper class to primitive datatype
        
        Boolean a = true;
        Character b = '@';
        Integer c = 169;
        Double d = 3.141;
        String e = "Aman";
        if(a){
            System.out.println(b+c+d+e);
        }
    } 
}
