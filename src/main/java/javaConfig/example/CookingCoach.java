package javaConfig.example;

import common.IAdviceService;
import common.ICoaching;

public class CookingCoach implements ICoaching {

    IAdviceService adviceService;

    public CookingCoach(IAdviceService adviceService){
        this.adviceService = adviceService;
    }

    @Override
    public String getWorkout() {
        return "si, si! pasta al dente";
    }

    @Override
    public String getAdvice() {
        return this.adviceService.getAdvice();
    }
}
