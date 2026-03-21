package main;

import services.DataMining;
import services.Devops;

public class LaunchTelusko {

    public static void main(String[] args){

        Telusko tel = new Telusko(new Devops());

//        tel.setCourse(new Devops());
//        tel.setCourse(new DataMining());

        Boolean status = tel.BuyTheCourse(2500.45);
        if(status){
            System.out.println("Course bought Sucessflly");
        }else {
            System.out.println("Failed to buy the course");
        }


    }
}
