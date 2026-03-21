package services;

public class DataMining implements ICourse{

    @Override
    public Boolean BuyCourse(Double amount) {
        System.out.println("DataMining course bought sucessfully and amount paid is" + amount);
        return true;
    }
}
