package beanScope.example;

import common.ICoaching;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class beanScopeMain {
    public static void main(String[] args){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanApplicationContext.xml");
        ICoaching coach01 = context.getBean("coachScope", ICoaching.class);
        ICoaching coach02 = context.getBean("coachScope", ICoaching.class);

        System.out.println(coach01 == coach02);
        System.out.println(coach01);
        System.out.println(coach02);

        ICoaching coach11 = context.getBean("instructor", ICoaching.class);
        ICoaching coach12 = context.getBean("instructor", ICoaching.class);

        System.out.println(coach11 == coach12);
        System.out.println(coach11);
        System.out.println(coach12);
    }
}
