package javaConfig.example;

import common.IAdviceService;
import common.ICoaching;
import org.springframework.beans.factory.annotation.Value;

public class CookingCoach implements ICoaching {

    IAdviceService adviceService;

    @Value("${foo.email}")
    String email;
    @Value("${foo.nationality}")
    String nationality;
    @Value("${foo.favouriteDish}")
    String favouriteDish;

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

    public String getEmail() {
        return email;
    }

    public String getNationality() {
        return nationality;
    }

    public String getFavouriteDish() {
        return favouriteDish;
    }
}
