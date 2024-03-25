public class Application {
    private String name;
    private String course;
    private int age;

    public Application(String name, String course){
        this.name = name;
        this.course = course;
        age = 18;
    }
    public void setAge(int age) throws Exception{
        if(age<18){
            throw new BelowAgeException();
        }
        else{
            this.age = age;
        }
    }
    public void displayDetails(){
        System.out.println("The Applicant's Name: "+name);
        System.out.println("Applied for: "+course);
        System.out.println("Applicant's Age: "+age);
    }
}
