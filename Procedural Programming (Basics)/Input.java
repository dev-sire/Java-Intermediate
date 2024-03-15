import java.util.Scanner;

//Basic User inputs and related exception handleing!
public class Input {
    public static void main(String[] args){
        Scanner MyObj = new Scanner(System.in);

        System.out.println("What's your name?");
        String user_name = MyObj.nextLine();

        System.out.print("How old are you?");
        int age = MyObj.nextInt();

        MyObj.nextLine();
        System.out.println("What's your favourite programming language?");
        String fav_lang = MyObj.nextLine();

        if(age>=18){
            System.out.println("Hello "+user_name+ "! You can drive");
        }  
        else{
            System.out.println("Hello "+user_name+ "! You are too young to drive");
        }

        System.out.println(fav_lang+" is your favourite language!");
        MyObj.close();
    }
}
