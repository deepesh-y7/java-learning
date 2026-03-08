package practiceNested;

class Computer{
    class Processor{

        void dispDetails(){
            System.out.println("Intel i5 2.4hz");
        }
    }


    void  showProcessorDetails(){
        Processor p1 = new Processor();
        p1.dispDetails();
    }
}

public class practiceNested1 {

    public static void main(String[] args){
        Computer c1 = new Computer();

        c1.showProcessorDetails();

    }
}
