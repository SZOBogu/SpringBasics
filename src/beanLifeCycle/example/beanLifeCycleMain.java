package beanLifeCycle.example;

import common.ICoaching;
import common.WeightliftingCoach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class beanLifeCycleMain {
    public static void main(String[] args){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanLifeCycleApplicationContext.xml");

        ICoaching coach = context.getBean("coachLifeCycle", WeightliftingCoach.class);
        System.out.println(coach.getAdvice());

        context.close();
    }
}
