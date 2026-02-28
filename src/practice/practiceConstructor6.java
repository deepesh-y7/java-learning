package practice;

//Write a Java program to create a class called Singleton that ensures only one instance of the class can be created. Implement a private constructor and a public static method to get the single instance of the class. Print a message indicating the creation of the instance.

class Singleton{

    private static Singleton singleInstance = null;

    private Singleton(){
        System.out.println("Singleton Instance Created.");
    }

    public static Singleton getInstance(){
        if(singleInstance == null) {
            singleInstance = new Singleton();
        }
        return singleInstance;
    }
}

public class practiceConstructor6 {

    public static void main(String[] args){
        Singleton s1 =  Singleton.getInstance();
        Singleton s2 =  Singleton.getInstance();

        if(s1==s2){
            System.out.println("Both instance are same");
        }else{
            System.out.println("Instances are Different");
        }
    }

}
