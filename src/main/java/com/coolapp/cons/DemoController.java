package com.coolapp.cons;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    // Define a private field for dependency
    private Coach myCoach;

    // Define a constructor for dependency injection
    @Autowired
    public void setCoach(@Qualifier("cricketCoach") Coach theCoach){
        myCoach = theCoach;
    }

    @GetMapping("/dailyworkout")
    public String getDailoyWorkout(){
        return myCoach.dailyWorkout();
    }


}
