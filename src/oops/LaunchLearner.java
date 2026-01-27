package oops;

class Learner{
    private  int id;
    private  String name;
    private String city;

    // Default Construtor
    Learner(){

    }

    //parameter constructor
    Learner(int id, String name, String city){
        this.id = id;
        this.name = name;
        this.city=city;
    }

    //setter
    void setId(int id){
        this.id = id;
    }
    void setName(String name){
        this.name = name;
    }
    void setCity(String city){
        this.city = city;
    }

    //Getter
    int getId(){
        return id;
    }
    String getName(){
        return name;
    }
    String getCity(){
        return city;
    }

}

public class LaunchLearner {
    public static void main(String[] args)
    {
     Learner L1 = new Learner();

     L1.setId(37);
     L1.setName("Deepesh");
     L1.setCity("Morena");

     Learner L2 = new Learner(48, "Girish", "Dabra");


     System.out.println("ID : " + L1.getId() + ", Name : "+ L1.getName() + ", City : " + L1.getCity());

     System.out.println("ID : " + L2.getId() + ", Name : "+ L2.getName() + ", City : " + L2.getCity());

    }
}
