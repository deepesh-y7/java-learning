package practiceNested;

class Person{

    class Address{

        public String city, state;

        Address(String city, String state){
            this.city =city;
            this.state =state;
        }

        public void printDetails(){
            System.out.println("Address is " + city + " , " + state);
        }

    }


}

public class practiceNested7 {

    public static void main(String[] args){

        Person ps = new Person();
        Person.Address Ad = ps.new Address("Morena", "M.P");
        Ad.printDetails();

    }

}
