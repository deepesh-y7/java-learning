package practiceNested;

//Write a Java program to create a class called House with a method calculateArea(). Inside this method, define a local class Room with a method getArea() that calculates and returns the area of the room (length * width). Instantiate the Room class and call the getArea() method from within calculateArea().

class House{

   public  void calculateArea(){
        class Room{

          public int getArea(int l , int w){
              return (l*w);
          }

        }

       Room room = new Room();

       // Calling the getArea method and printing the area
       double area = room.getArea(5,7);
       System.out.println("Area of the room: " + area);

    }
}

public class practiceNested6 {
    public static void main(String[] args){
    House h1 = new House();
    h1.calculateArea();

    }




}
