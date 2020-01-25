package AnnotationBasics;

import org.springframework.stereotype.Component;

@Component("TomekH")
public class FootballCoach implements common.ICoaching {
    @Override
    public String getWorkout() {
        return "3 okrazenia";
    }

    @Override
    public String getAdvice() {
        return null;
    }
}
