package ioc.example;

public class WeightliftingCoach implements ICoaching{

    @Override
    public String getWorkout(){
        return  "5x5 3pl8 squat";
    }
}
