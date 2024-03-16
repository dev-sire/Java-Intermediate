public class Car extends Vehicle {
    private String name;
    private String model;
    private int year;

    int wheels = 4;
    int doors = 4;

    Car(String name, String model, int year){
        this.SetName(name);
        this.SetModel(model);
        this.SetYear(year);
    }
    Car(Car x){
        this.copy(x);
    }
    public String GetName(){
        return name;
    }

    public String GetModel(){
        return model;
    }

    public int GetYear(){
        return year;
    }

    public void SetName(String name){
        this.name = name;
    }

    public void SetModel(String model){
        this.model = model;
    }

    public void SetYear(int year){
        this.year = year;
    }

    public void copy(Car x){
        this.SetName(x.GetName());
        this.SetModel(x.GetModel());
        this.SetYear(x.GetYear());
    }

    //Overriding Method
    void go(){
        System.out.println("This "+ name+ " is Moving");
    }
    
    void stop(){
        System.out.println("This "+ name +" has Stopped");
    }
}
