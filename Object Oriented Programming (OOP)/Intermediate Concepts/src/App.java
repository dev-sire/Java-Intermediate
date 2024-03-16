public class App {
    public static void main(String[] args) {

        // Overloaded Constructors: Multiple constructors within the same class but with different parameters
        //                          Signature = Name + Parameters   

        Dimensions myBox = new Dimensions(10,20,30);
        Dimensions myBox2 = new Dimensions();
        Dimensions myCube = new Dimensions(10);

        double vol;
        vol = myBox.volumn();
        System.out.println("Volumn of box 1: "+vol);

        vol = myBox2.volumn();
        System.out.println("Volumn of box 2: "+vol);
        
        vol = myCube.volumn();
        System.out.println("Volumn of Cube is: "+vol);

        // Array Of Objects: An array capable of instantiating multiple or grouped Object of the same class

        Fruits[] refg = new Fruits[3];
        Fruits apple = new Fruits("Apple");
        Fruits orange = new Fruits("Orange");
        Fruits mango = new Fruits("Mango");

        refg[0] = apple;
        refg[1] = orange;
        refg[2] = mango;

        for (Fruits fruits : refg) {
            System.out.println(fruits.name);
        }

        // Static Keyword: Modifier, A Single copy of a variable/methods is created and shared.
        //        The class "Owns" the Static member
        
        Friends friend1 = new Friends("TestName1");
        Friends friends2 = new Friends("TestName2");
        Friends friends3 = new Friends("TestName3"); 

        Friends.diplayFriends();

        //Passing Objects: It is a method of passing Objects of different classes to other objects of separate classes 

        // Encapsulation: Attributes of a class will be hidden/private and can only be accessed through Methods (Getters/Setters)
        //              -- you should make variables private if you don't have a reason to make them public
  
        Garage garage = new Garage();
        Car car = new Car("BMW","X7",2023);
        Car car2 = new Car("Audi","E-tron",2020);
        Car car3 = new Car("Tesla","Plaid",2024);

        //Copy Constrsuctor
        Car car4 = new Car(car);
        System.out.println(car4.GetName());

        // car2.copy(car);

        garage.park(car);
        garage.park(car2);
        garage.park(car3);

        System.out.println(car2.GetName());
        System.out.println(car2.GetModel());
        System.out.println(car2.GetYear());

        // Inheritance: The process through which one class acquires the attributes and methods of the other
        //      The vehicle class is the Parent/Base Class while the Car and Bicycle are the Derived/Child class

        // Method Overriding: Declaring a Method in an sub class that is already present in the base class,
        //      -- This is done so the child class may has it's own Implementation

        // Abstraction: Abstract classes cannot be instantiated. but they can have a Sub-class
        //              Abstract Methods are declared but not implemented 
        
        // Copy Objects: A special method within a class to copy the object's atrributes

        Bicycle bike = new Bicycle("R-1093");
        car.go();
        car.stop();
        bike.stop();
        System.out.println(car.wheels);
        System.out.println(bike.wheels);

        // Super Keyword: This refers to the SuperClass (Parent) of an object
        //              -- Very similar to "this" keyword

        Villan villan1 = new Villan("Malakh", 42, "Oculus");
        Villan villan2 = new Villan("Hassassin", 45, "Infiltration");
        System.out.println(villan1.toString());
        System.out.println(villan2.toString());
   
    }
}
