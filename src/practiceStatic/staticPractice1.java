package practiceStatic;

//Write a Java program to create a class called "Counter" with a static variable count. Implement a constructor that increments count every time an object is created. Print the value of count after creating several objects.
//

class Counter{
    static int count = 0;

    Counter(){
        System.out.println("New object created");
        count++;
    }

    void disp(){
        System.out.println("Count is : " + count);
    }

}


public class staticPractice1 {
    public static void main(String[] args){
        Counter c1 = new Counter();
        c1.disp();
        Counter c2 = new Counter();
        c2.disp();
        Counter c3 = new Counter();
        c3.disp();

    }
}
