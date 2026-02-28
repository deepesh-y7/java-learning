package practice;

 class Rectangle{
     int length , width;

     Rectangle(int length, int width){
         this.length = length;
         this.width = width;
     }

     Rectangle(Rectangle r){
         this.length = r.length;
         this.width = r.width;
     }

 }

public class practiceConstructor4 {
     public static void main(String[] args){
         Rectangle r1 =new Rectangle(10,20);

         Rectangle r2 = new Rectangle(r1);

         System.out.println(r1.length +" ----"+ r1.width);
         System.out.println(" --------------------");
         System.out.println(r2.length +" ----"+ r2.width);
     }
}
