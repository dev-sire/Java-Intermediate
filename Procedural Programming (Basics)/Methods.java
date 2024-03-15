public class Methods {

    static void greet(String name, int age){
        System.out.println("Hello "+name);
        System.out.println("You are "+age+" Years Old");
    }

    static void displayResult(){
        System.out.println("The Results Will be announced soon. Have Patience!");
    }

    public static void main(String[] args){
        greet("Aman", 19);
        displayResult();
    }
}
