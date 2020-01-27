package javaConfig.example;

import common.IAdviceService;
import common.ICoaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@org.springframework.context.annotation.Configuration
//@ComponentScan(basePackages = {"common", "javaConfig.example"})
public class Configuration {
    @Bean
    public IAdviceService adviceService(){
        return new CookingAdvice();
    }

    @Bean
    public ICoaching cookingCoach(){
        return new CookingCoach(adviceService());
    }
}
