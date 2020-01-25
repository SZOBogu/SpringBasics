package AnnotationBasics;

import common.ICoaching;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationMain {
    public static void main(String[] args){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("annotationApplicationContext.xml");

        ICoaching coach = context.getBean("TomekH", ICoaching.class);
        System.out.println(coach.getWorkout());

        ICoaching coachExplicit = context.getBean("JeffCavaliereAthleanXDotCom", ICoaching.class);
        System.out.println(coachExplicit.getWorkout());
        System.out.println(coachExplicit.getAdvice());

        //doesn't work when we give AthleteCoach id
//        ICoaching coachImplicitButNamed = context.getBean("athleteCoach", ICoaching.class);
//        System.out.println(coachImplicitButNamed.getWorkout());

        context.close();
    }
}
