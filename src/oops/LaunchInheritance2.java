package oops;

import java.security.PublicKey;

class Alpha{
    int a,b;

    public Alpha(){
        a=10;
        b=20;
        System.out.println("Alpha Zero Param Constructor");
    }

    public Alpha(int a, int b){
        this();
        this.a =a;
        this.b= b;
        System.out.println("Param Constructor of Alpha");
    }
}

class Beta extends Alpha
{
    int x,y;

    public Beta(){
        this(2,2);
        x=1;
        y=2;
        System.out.println("Beta Zero param Constructor");
    }

    public Beta(int x , int y ){
        super(7,8);
        this.x =x;
        this.y =y;
        System.out.println("Beta Param Constructor");
    }

    public void disp(){
        System.out.println("a : " + a);
        System.out.println("b : " + b);
        System.out.println("c : " + x);
        System.out.println("d : " + y);
    }

}

public class LaunchInheritance2 {
    public static void main(String[] args){

        Beta b = new Beta();
        b.disp();
    }
}
