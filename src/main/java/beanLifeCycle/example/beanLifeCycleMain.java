package beanLifeCycle.example;

import common.ICoaching;
import common.WeightliftingCoach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class beanLifeCycleMain {
    public static void main(String[] args){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanLifeCycleApplicationContext.xml");

        ICoaching coachS = context.getBean("coachLifeCycle", WeightliftingCoach.class);
        System.out.println("singleton: " + coachS.getAdvice());
        ICoaching coachP = context.getBean("coachLifeCyclePrototype", WeightliftingCoach.class);
        System.out.println("prototype: " + coachP.getAdvice());

        context.close();
    }
}
