package AnnotationBasics;

import common.ICoaching;
import org.springframework.stereotype.Component;

@Component("JeffCavaliereAthleanXDotCom")
public class AthleteCoach implements ICoaching {
    @Override
    public String getWorkout() {
        return "3x12 face pulls";
    }

    @Override
    public String getAdvice() {
        return "to look lika an athlete you have to train lika an athlete";
    }
}
