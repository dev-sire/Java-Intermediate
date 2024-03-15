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

        //Passing Objects: It is a method of passing Objects of different classes to other objects of separate classes 

        Garage garage = new Garage();
        Car car = new Car("BMW");
        Car car2 = new Car("Audi");
        Car car3 = new Car("Tesla");
        garage.park(car);
        garage.park(car2);
        garage.park(car3);

        // Static Keyword: Modifier, A Single copy of a variable/methods is created and shared.
        //                The class "Owns" the Static member
        
        Friends friend1 = new Friends("TestName1");
        Friends friends2 = new Friends("TestName2");
        Friends friends3 = new Friends("TestName3"); 

        Friends.diplayFriends();

        // Inheritance: The process through which one class acquires the attributes and methods of the other
        //      The vehicle class is the Parent/Base Class while the Car and Bicycle are the Derived/Child class

        Bicycle bike = new Bicycle("Bike1");
        bike.stop();
        car.go();
        System.out.println(car.wheels);
        System.out.println(bike.wheels);
    }
}
