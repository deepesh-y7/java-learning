package InheritancePractice;

//3. Write a Java program to create a class called Shape with a method called getArea(). Create a subclass called Rectangle that overrides the getArea() method to calculate the area of a rectangle.

class Shape{

    public double getArea(){
        return 0.0 ;
    }
}


class Rectangle extends Shape{

    private double length ;
    private double breadth ;


    public Rectangle(double length, double breadth){
        this.length = length;
        this.breadth = breadth;
    }

    public double getArea(){
        return length * breadth;
    }

}


public class InheritancePractice2 {

    public static void main(String[] args){
        Rectangle r1 = new Rectangle(6.0 , 5.4);
        double area = r1.getArea();
        System.out.println("The area of the rectangle is: " + area);
    }
}
