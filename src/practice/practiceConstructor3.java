package practice;

class Student{

   String studentId, studentName, grade ;

    Student(){

       studentId = "Unknown";
       studentName = "Unknown";
       grade = "0";
    }

    Student( String studentId, String studentName, String grade){
        this();
        this.studentId =studentId;
        this.studentName =studentName;
        this.grade =grade;
    }

    void disp(){
        System.out.println("Student name is  :" + studentName);
        System.out.println("Student student id is  :" + studentId);
        System.out.println("Student grade is  :" + grade);
        System.out.println("-------------------------");
    }

}

public class practiceConstructor3 {
    public static void main(String[] args){
        Student s1 = new Student();
        Student s2 = new Student("g2", "gaurav","A");

        s2.disp();

    }
}
