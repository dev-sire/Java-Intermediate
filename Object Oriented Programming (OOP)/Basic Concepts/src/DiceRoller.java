import java.util.Random;

public class DiceRoller {
    Random random;
    int number = 0;

    DiceRoller(){
        random = new Random();
        Roll();
    }
    void Roll(){
        number = random.nextInt(6)+1;
        System.out.println(number);
    }
    
}
