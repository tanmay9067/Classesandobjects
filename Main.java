import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Student Kunal = new Student(13,"Kunal Kushwaha",90.2);
        Student Ramesh = new Student(12,"Raamesh Tendulkar",90.3);
        Student Anil = new Student (11,"Anil Ambani",80.2);
        Scanner input = new Scanner(System.in);
        String Taken = input.nextLine();
        System.out.println(Kunal.rollNo);

    }
}
class Student{
    int rollNo;
    String name;
    double marks;

    Student(int rollN,String nam,double mark){
        this.rollNo=rollN;
        this.name=nam;
        this.marks=mark;
    }
}



