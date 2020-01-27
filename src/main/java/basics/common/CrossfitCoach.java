package basics.common;

public class CrossfitCoach implements ICoaching {

    private IAdviceService adviceService;

    public CrossfitCoach(IAdviceService adviceService){
        this.adviceService = adviceService;
    }

    @Override
    public String getWorkout() {
        return "Go directly to Snap City";
    }

    @Override
    public String getAdvice() {
        return adviceService.getAdvice();
    }
}
