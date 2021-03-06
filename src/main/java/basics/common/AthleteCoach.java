package basics.common;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("JeffCavaliereAthleanXDotCom")
public class AthleteCoach implements ICoaching {
    private IAdviceService adviceService;

    public AthleteCoach(){}

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

    @Autowired
    @Qualifier("unrelatedAdvice")
    public void setAdviceService(IAdviceService adviceService) {
        this.adviceService = adviceService;
    }
}
