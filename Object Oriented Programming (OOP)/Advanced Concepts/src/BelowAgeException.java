public class BelowAgeException extends Exception {
    BelowAgeException(){
        super("Age is under 18");
    }
}