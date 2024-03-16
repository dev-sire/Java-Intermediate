public class Villan extends Person {
    String power;

    Villan(String Name, int Age, String Power){
        //Refers or Calls the constructor of parent Class
        super(Name, Age);
        this.power = Power;
    }

    public String toString(){
        return super.toString()+this.power;
    }
}
