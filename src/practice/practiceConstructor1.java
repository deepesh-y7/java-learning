package practice;

class Dog{
    String name;
    String color;

    Dog(String name, String color){
        this.color =color;
        this.name = name;
    }

    void disp(){
        System.out.println("Dog name is : " + name);
        System.out.println("Dog color is : " + color);
    }

}

public class practiceConstructor1 {
    public static void main(String[] args){
        Dog D1 = new Dog("WICK", "BLACK");
        D1.disp();
    }
}
