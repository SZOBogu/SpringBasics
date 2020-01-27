package basics.common;

public class WeightliftingCoach implements ICoaching {

    private basics.common.IAdviceService adviceService;

    public WeightliftingCoach(IAdviceService adviceService){
        this.adviceService = adviceService;
    }

    @Override
    public String getWorkout(){
        return  "5x5 3pl8 squat";
    }

    @Override
    public String getAdvice(){
        return this.adviceService.getAdvice();
    }

    //shown via beanLifeCycleMain
    public void init(){
        System.out.println("do you even lift?");
    }

    public void destroy(){
        System.out.println("*does cardio once*");
    }


}
