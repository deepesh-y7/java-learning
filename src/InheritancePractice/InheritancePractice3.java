package InheritancePractice;

class Employee{

    public void work(){
        System.out.println("Employee working");
    }

    public void getSalary(){
        System.out.println("get salary ");
    }

}

class HRManager extends Employee{

    public void work(){
        System.out.println("HR manager working");
    }

    public void addEmployee(){

        System.out.println("New emplaoyee added");
    }
}

public class InheritancePractice3 {

    public static void main(String[] args){
        Employee e1 = new Employee();
        e1.work();
        e1.getSalary();

        HRManager hr = new HRManager();
        hr.work();
        hr.addEmployee();


    }
}
