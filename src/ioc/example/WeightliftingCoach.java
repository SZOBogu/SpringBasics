package ioc.example;

public class WeightliftingCoach implements ICoaching{

    private IAdviceService adviceService;

    public WeightliftingCoach(IAdviceService adviceService){
        this.adviceService = adviceService;
    }

    @Override
    public String getWorkout(){
        return  "5x5 3pl8 squat";
    }

    public String getAdvice(){
        return this.adviceService.getAdvice();
    }
}
