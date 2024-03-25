import java.util.*;

class Students implements Comparable<Students>{
    private int rank;
    private String name;

    public Students(int rank, String name){
        this.name = name;
        this.rank = rank;
    }

    @Override
    public int compareTo(Students st) {
      if(rank < st.rank)
        return -1;
        else if(rank > st.rank)
            return 1;
        return 0;
    }
    @Override
    public String toString(){
        String result = "Student Name: "+ name+ ", Rank: "+ rank;
        return result;
    }

}
public class PriorityQueues {
    public static void main(String[] args){
        PriorityQueue<Students> studentsQ = new PriorityQueue<>();

        studentsQ.add(new Students(4, "Haris Ali Khan"));
        studentsQ.add(new Students(2, "Aman Shahid"));
        studentsQ.add(new Students(1, "Muzammil"));
        studentsQ.add(new Students(3, "Subhan Nalla"));

        System.out.println("The Size of Queue: "+ studentsQ.size());

        Iterator<Students> i = studentsQ.iterator();

        while(i.hasNext()){
            System.out.println("The item of the Queue: "+ studentsQ.poll().toString());
        }


    }
}
