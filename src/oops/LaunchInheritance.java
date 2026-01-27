package oops;

class Telusko{
   private  int age;

    void disp(){
        age=10;
        System.out.println("oops.Telusko age is : " + age);
    }
}

class Alien extends Telusko{

//    void disp2(){
//        age = 20;
//        System.out.println("ALien age is : " + age);
//    }
}

public class LaunchInheritance {
    public static void main(String[] args){
        Telusko t1 = new Telusko();
        t1.disp();
//
//        oops.Alien a1 = new oops.Alien();
//        a1.disp();
//        a1.disp2();

    }
}
