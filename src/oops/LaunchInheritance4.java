package  oops;

class Plane1{

}

class FighterPlane extends Plane1{

}

class Animal
{
    public void eat(){
        System.out.println("Animal eating");
    }

    void  sleep(){
        System.out.println("Animal Sleep");
    }

//    public void running(){
//        System.out.println("Animal is Running");
//    }

    public Plane1 running(){
        System.out.println("plane is run");
         Plane1 p = new Plane1();
        return p;
    }



}

class  Tiger extends Animal{

   public void eat(){
        System.out.println("Tiger hunt");
    }

    public FighterPlane running(){
       System.out.println("Fighterpalne run");
       FighterPlane fp = new FighterPlane();
       return fp;
    }
}


public class LaunchInheritance4 {

    public static void main(String[] args){
        Tiger T = new Tiger();
        T.eat();
        T.running();
        Animal A1 = new Animal();
        A1.running();
        Animal A2 = new Tiger();
        A2.running();
    }
}