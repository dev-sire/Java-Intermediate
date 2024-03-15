import java.util.Scanner;

public class Marksheet {
    public static void displayResult(String name, String roll_number,float per){
        System.out.println("Student Name: "+name);
        System.out.println("Roll Number: "+roll_number);
        System.out.println("Obtained Percentage: "+per);
        if(per>=80&&per<100){
            System.out.println("Grade: A1");
        }
        else if(per>=70&&per<80){
            System.out.println("Grade: A");
        }
        else if(per>=60&&per<70){
            System.out.println("Grade: B");
        }
        else if(per>=50&&per<60){
            System.out.println("Grade: D");
        }
        else if(per>=40&&per<50){
            System.out.println("Grade: E");
        }
        else{
            System.out.println("Grade: F");
        }
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String name, rollNo;
        float sum = 0, per;
        String[] subjects = {"Programming Fundamentals", "Calculus","IICT","Functional English","Applied Physics"};
        float[] marks = new float[5];
        System.out.println("Enter Your Name: ");
        name = scanner.nextLine();
        System.out.println("Enter Your Roll Number: ");
        rollNo = scanner.nextLine();
        System.out.println("*****Enter your Obtained Marks of all 5 Subjects*****");
        for(int i=0; i<marks.length; i++){
            System.out.print("Enter your "+subjects[i]+" Marks: ");
            marks[i] = scanner.nextInt();
            sum += marks[i];
        }
        per = (sum/550)*100;
        displayResult(name,rollNo,per);
        scanner.close();
    }
}
