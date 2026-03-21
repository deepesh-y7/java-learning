package services;

public class Devops implements ICourse {

    @Override
    public Boolean BuyCourse(Double amount) {
        System.out.println("Devops course bought sucessfully and amount paid is" + amount);
        return true;
    }
}
