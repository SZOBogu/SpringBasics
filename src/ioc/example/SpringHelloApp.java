package ioc.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringHelloApp {
    public static void main(String[] args){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        ICoaching coach = context.getBean("coach", ICoaching.class);
        System.out.println(coach.getWorkout());
        context.close();
    }
}
