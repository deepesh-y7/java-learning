package main;

import services.ICourse;

public class Telusko {

    private ICourse course;

    public Telusko(ICourse course) {
        super();
        this.course = course;
    }

    public void setCourse(ICourse course) {

        this.course = course;
    }

    public Telusko(){
        super();
    }

    public Boolean  BuyTheCourse(Double amount){
      return  course.BuyCourse(amount);
    }


}
