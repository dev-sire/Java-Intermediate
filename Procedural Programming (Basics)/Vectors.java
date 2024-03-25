import java.util.Vector;

public class Vectors {
    public static void main(String[] args){
        Vector<Integer> numVectors = new Vector<>();
        numVectors.add(10);
        numVectors.add(20);
        numVectors.add(30);
        numVectors.add(40);
        numVectors.add(50);

        System.out.println("The size of vector is: "+ numVectors.size());

        System.out.println("NUmbers: "+ numVectors);
        
        numVectors.add(2, 300);
        
        for (Integer integer : numVectors) {
            System.out.println(integer);
        }

    }    
}
