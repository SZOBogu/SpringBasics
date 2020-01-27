package javaConfig.example;

import common.ICoaching;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class javaConfigMain {
    public static void main(String[] args){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Configuration.class);

        ICoaching coach = context.getBean("cookingCoach", ICoaching.class);
        System.out.println(coach.getWorkout());
        System.out.println(coach.getAdvice());

        context.close();
    }
}
