public class App {
    public static void main(String[] args) {
        
        // Interface: A template that can be applied to a class, Similar to inheritance but it specifies what a class has /must do
        //             -- Classes can apply more than one interface, inheritance is limited to 1 super class

        Fish small_fish = new Fish();
        Fish large_fish = new Fish();
        Rabbit rabbit = new Rabbit();
        Hawk hawk = new Hawk();

        small_fish.flee();
        large_fish.hunt();
        hawk.hunt();
        rabbit.flee();

    }
}
