package javaConfig.example;

import common.ICoaching;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.ObjectInputFilter;

public class javaConfigMain {
    public static void main(String[] args){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Configuration.class);

        ICoaching coach = context.getBean("footballCoach", ICoaching.class);
        System.out.println(coach.getWorkout());
        System.out.println(coach.getAdvice());

        ICoaching coachExplicit = context.getBean("JeffCavaliereAthleanXDotCom", ICoaching.class);
        System.out.println(coachExplicit.getWorkout());
        System.out.println(coachExplicit.getAdvice());

        context.close();
    }
}
