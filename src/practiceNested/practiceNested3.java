package practiceNested;

class Car{

    void startEngine(){

        class Engine{
            void run(){
                System.out.println("Engine is running");
            }
        }

        Engine e1 = new Engine();
        e1.run();

    }
}

public class practiceNested3 {

    public static void main(String[] args){
        Car c1= new Car();
        c1.startEngine();
    }

}
