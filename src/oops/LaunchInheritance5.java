package oops;

class Demo{

   static int a,b;

    static {
        a=10;
        b= 20;

        System.out.println("Parent static method");
    }

    static void show(){
        System.out.println("a : "+ a);
        System.out.println("a : "+ b);
    }
}

class Childd extends Demo{

   static void show(){
       b=25;
        System.out.println("a is " + a);
        System.out.println("b is " + b);
    }

}


public class LaunchInheritance5 {
    public static void main(String[] args){

        Demo.show();
        System.out.println("********************");
        Childd.show();
    }
}