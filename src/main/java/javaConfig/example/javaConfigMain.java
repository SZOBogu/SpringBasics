package javaConfig.example;

import common.ICoaching;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class javaConfigMain {
    public static void main(String[] args){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Configuration.class);

        CookingCoach coach = context.getBean("cookingCoach", CookingCoach.class);
        System.out.println(coach.getWorkout());
        System.out.println(coach.getAdvice());
        System.out.println(coach.getEmail());
        System.out.println(coach.getNationality());
        System.out.println(coach.getFavouriteDish());

        context.close();
    }
}
