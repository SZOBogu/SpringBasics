package AnnotationBasics;

import common.IAdviceService;
import common.ICoaching;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("JeffCavaliereAthleanXDotCom")
public class AthleteCoach implements ICoaching {
    private IAdviceService adviceService;

    @Autowired
    public AthleteCoach(IAdviceService adviceService){
        this.adviceService = adviceService;
    }

    @Override
    public String getWorkout() {
        return "3x12 face pulls";
    }

    @Override
    public String getAdvice() {
        return this.adviceService.getAdvice() ;
    }
}
