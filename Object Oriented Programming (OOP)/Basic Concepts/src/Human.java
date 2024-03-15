public class Human {
    //Attributes

    String name;
    int age;
    double weight;

    //Constructor For assigning unique values
    
    Human(String name, int age, double weight){
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    //Methods 

    void program(){
        System.out.println(this.name+" is Programming");
    }
    void debug(){
        System.out.println(this.name+" is Debugging this code-base");
    }
}
