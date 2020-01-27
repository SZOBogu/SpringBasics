package scopeAnnotation.example;

import common.IAdviceService;
import common.ICoaching;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class SwimmingCoach implements ICoaching {
    private IAdviceService adviceService;

    public SwimmingCoach(){}

    public SwimmingCoach(IAdviceService adviceService){
        this.adviceService = adviceService;
    }

    @Override
    public String getWorkout() {
        return "get in the water and don't drown";
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

    @PostConstruct
    public void init(){ System.out.println("init");}

    @PreDestroy
    public void destroy(){ System.out.println("destroy");}
}
