import java.util.Scanner;

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

        // Ploymorphism: greek word for poly - "many" and morph - "forms"
        //              The ability of an object to have more than one forms
        
        Car car = new Car();
        Bicycle bicycle = new Bicycle();
        Boat boat = new Boat();

        Vehicle[] racers = {car, bicycle, boat};

        for (Vehicle vehicle : racers) {
            vehicle.go();
        }

        // Dynamic Polymorphism: Polymorphism during runtime or after compilation

        Scanner scanner = new Scanner(System.in);
        Animal animal;
        System.out.println("What Animal do you want?");
        System.out.print("(1: Dog) or (2: Cat)");
        int choice = scanner.nextInt();

        if(choice == 1){
            animal = new Dog();
            animal.speak();
        }
        else if(choice == 2){
            animal = new Cat();
            animal.speak();
        }
        else{
            animal = new Animal();
            System.out.println("The choice was invalid");
            animal.speak();
        }
        
        scanner.close();
    }
}
