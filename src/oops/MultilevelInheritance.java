package oops;


class Aeroplane{

    void fly(){
        System.out.println("Aeroplane is Flying");
    }

    void landing(){
        System.out.println("Aeroplane is Landing");
    }

    {
        System.out.println("Java instialiasion block of aeroplane");
    }

    Aeroplane(){
        System.out.println("Default constructor Aeroplane");
    }
}

class CargoPlane extends Aeroplane
{

}

class CommercialPlane extends CargoPlane
{

}


public class MultilevelInheritance {

    public static void main(String[] args)
    {
        CommercialPlane cp = new CommercialPlane();

    }
}