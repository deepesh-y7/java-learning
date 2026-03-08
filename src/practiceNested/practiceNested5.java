package practiceNested;

//Write a Java program to create an outer class called 'MathUtil' with a static nested class Calculator. The Calculator class should have a static method add(int a, int b) that returns the sum of a and b. Call the add() method from the main method.



 class MathUtil {

    // Static nested class Calculator
     static class Calculator {

        // Static method add that returns the sum of two integers
        public static int add(int a, int b) {
            return a + b;
        }
    }

public class practiceNested5 {
         public static void main(String[] args){

            int sum = MathUtil.Calculator.add(4,5);
         }
}
}
