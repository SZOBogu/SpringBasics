package basics.javaConfig.example;

import basics.common.IAdviceService;
import basics.common.ICoaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

@org.springframework.context.annotation.Configuration
//@ComponentScan(basePackages = {"common", "javaConfig.example"})
@PropertySource("cooking.properties")
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
