package InheritancePractice;

//7. Write a Java program to create a class known as Person with methods called getFirstName() and getLastName(). Create a subclass called Employee that adds a new method named getEmployeeId() and overrides the getLastName() method to include the employee's job title.

class Person{

    private String fname ;
    private String lname;

    Person(String fname, String lname){
        this.fname = fname;
        this.lname = lname;
    }

    public String getFname(){
        return fname;
    }
    public String getLname(){
        return lname;
    }

}

class Employee1 extends Person{

    private int employeeId;
    private String jobTitle;

    public Employee1(String fname,String lname , String jobTitle, int employeeId){
        super(fname, lname);
        this.employeeId = employeeId;
        this.jobTitle = jobTitle;
    }

    public int getEmployeeId(){
        return employeeId;
    }

    public String getLname(){
     return super.getLname() + jobTitle;
    }



}

public class InheritancePractice5 {

    public static void main(String[] args){

        Employee1 e1 = new Employee1("Deepesh", "Yadav", "senior java developer",37);

        System.out.println(e1.getFname() + " " + e1.getLname() + " (" + e1.getEmployeeId() + ")");


    }
}
