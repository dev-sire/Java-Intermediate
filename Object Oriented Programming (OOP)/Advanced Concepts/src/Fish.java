public class Fish implements Prey,Predator{
    @Override
    public void hunt(){
        System.out.println("***This fish is hunting Larger Fish***");
    }

    @Override 
    public void flee(){
        System.out.println("***This Fish is fleeing from a larger fish***");
    }
    
}
