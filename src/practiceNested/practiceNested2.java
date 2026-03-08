package practiceNested;

class University{

    static class Department{

        void dispInfo(){
            System.out.println("IT Department");
            System.out.println("Total Faculty = 10");
        }
    }
}

public class practiceNested2 {

    public static void main(String[] args){
        University.Department d1 = new University.Department();
        d1.dispInfo();
    }
}
