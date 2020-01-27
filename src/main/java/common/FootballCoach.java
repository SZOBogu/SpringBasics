package common;

import common.IAdviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class FootballCoach implements common.ICoaching {

    private IAdviceService adviceService;

    public FootballCoach(){}

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

    @Autowired
    @Qualifier("notEvenAnAdvice")
    public void setAdviceService(IAdviceService adviceService) {
        this.adviceService = adviceService;
    }
}
