public class Person {
    String name;
    int age;

    Person(String Name, int Age){
        this.name = Name;
        this.age = Age;
    }
    
    public String toString(){
        return this.name+"\n"+this.age+"\n";
    }
}
