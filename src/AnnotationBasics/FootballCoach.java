package AnnotationBasics;

import common.IAdviceService;
import org.springframework.stereotype.Component;

@Component("TomekH")
public class FootballCoach implements common.ICoaching {
    private IAdviceService adviceService;

    public FootballCoach(IAdviceService adviceService){
        this.adviceService = adviceService;
    }


    @Override
    public String getWorkout() {
        return "3 okrazenia";
    }

    @Override
    public String getAdvice() {
        return adviceService.getAdvice();
    }
}
