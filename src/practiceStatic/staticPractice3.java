package practiceStatic;

//Write a Java program to create a class called "Initializer" with a static block that initializes a static variable 'initialValue' to 1000. Print the value of 'initialValue' before and after creating an instance of "Initializer".

class Initializer{

    static int intialValue ;

    static {
        intialValue =1000;
    }

}

public class staticPractice3 {

    public static void main(String[] args){

        System.out.println(Initializer.intialValue);

        Initializer I1 = new Initializer();

        System.out.println(I1.intialValue);


    }
}
