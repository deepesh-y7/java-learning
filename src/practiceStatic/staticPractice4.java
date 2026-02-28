package practiceStatic;

//Write a Java program to create a class called Constants with a static final variable 'PI' initialized to 3.14159. Create a method to calculate the area of a circle given its radius, using the 'PI' constant. Demonstrate the method in the main method.

class Constants{
     static final double PI = 3.14159 ;

     static double calculateArea(double radius){
         return PI * radius * radius;
     }


}

public class staticPractice4 {

    public static void main(String[] args){
        double radius = 8;

        double area = Constants.calculateArea(radius);

        System.out.println(area);

    }
}
