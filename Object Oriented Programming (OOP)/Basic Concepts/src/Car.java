public class Car {
    //Attributes

    String make = "Chevrolet";
    String model = "Corvette";
    int year = 2020;
    String color = "Red";
    double price = 50000.00;

    //Methods
    void Drive(){
        System.out.println("Your are driving the car");
    }
    void Brake(){
        System.out.println("You Stepped on the Brakes");
    }
    //Over Writing the ToString Method
    
    public String toString(){
        return make +"\n"+model+"\n"+year+"\n"+color+"\n"+price;
    }

}
