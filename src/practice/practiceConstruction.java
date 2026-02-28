package practice;

class Cat{
    int age;
    String name;

    Cat(){
        name = "Unknown";
        age = 0;
        System.out.println("name :" + name );
        System.out.println("Age :"+ age);
    }

}

public class practiceConstruction {
   public static void main(String[] args){
    Cat c1 = new Cat();
   }
}
