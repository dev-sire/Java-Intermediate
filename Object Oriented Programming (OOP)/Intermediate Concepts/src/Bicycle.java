public class Bicycle extends Vehicle {
    int wheels = 2;
    int pedals = 2;
    String name;
    Bicycle(String name){
        this.name = name;
    }
    void go(){
        System.out.println("Bicycle "+ name+ " is Moving");
    }
    
    void stop(){
        System.out.println("Bicycle "+ name +" has Stopped");
    }
}
