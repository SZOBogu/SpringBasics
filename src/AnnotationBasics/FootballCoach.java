package AnnotationBasics;

import common.IAdviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("TomekH")
public class FootballCoach implements common.ICoaching {
    @Autowired
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

    public void setAdviceService(IAdviceService adviceService) {
        this.adviceService = adviceService;
    }
}
