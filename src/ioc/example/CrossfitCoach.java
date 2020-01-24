package ioc.example;

public class CrossfitCoach implements ICoaching {
    @Override
    public String getWorkout() {
        return "Go directly to Snap City";
    }

    @Override
    public String getAdvice() {
        return null;
    }
}
