package com.coolapp.cons;


import org.springframework.stereotype.Component;

@Component
public class SoccerCoach implements Coach {


    @Override
    public String dailyWorkout() {
        return "Practice 15 Kicks everyday";
    }
}
