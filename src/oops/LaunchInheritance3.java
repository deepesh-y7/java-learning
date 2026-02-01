package oops;

class  Parent{

    int i =10;
    void disp(){
        System.out.println("Disp of Parent");
    }
}

class Child extends Parent{
    int i =100;
    void alpha(){
        System.out.println("Alpha");
        System.out.println(i);
        System.out.println(super.i);

        super.disp();
    }

    void disp(){
        System.out.println("Child");
    }
}


public class LaunchInheritance3 {

    public static void main(String[] args){
        new Child().alpha();
        new Child().disp();

    }
}