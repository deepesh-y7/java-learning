package practiceStatic;

//
//2. Static Methods
//
//Write a Java program to create a class called "MathUtility" with a static method add that takes two integers and returns their sum. Demonstrate the usage of this static method in the main method without creating an instance of "MathUtility".

class MathUtility{

    static int add(int a , int b){

        int sum = a+b;
        return sum;
    }
}

public class staticPractice2 {

    public static void main(String[] args){
      int total =  MathUtility.add(4,5);

        System.out.println(total);

    }
}
