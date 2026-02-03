package oops;

 class Animal1{

   final static int a = 10;
    double age;

    final  public static void eat(){

        System.out.println("Animal Eat");
    }

}

class  Tiger1 extends Animal1{



    void disp(){
//        a =90;
        System.out.println(a);
    }
}


public class LaunchInheritance6 {

    public static void main(String[] args){

        Tiger1 t1 = new Tiger1();
        t1.eat();
        t1.disp();
    }
}