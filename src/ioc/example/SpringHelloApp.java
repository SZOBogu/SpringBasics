package ioc.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringHelloApp {
    public static void main(String[] args){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        ICoaching coachConstructor = context.getBean("coach", ICoaching.class);
        System.out.println(coachConstructor.getWorkout());
        System.out.println(coachConstructor.getAdvice());

        ZumbaCoach coachSetter = context.getBean("zumbaCoach", ZumbaCoach.class);
        System.out.println(coachSetter.getWorkout());
        System.out.println(coachSetter.getAdvice());
        System.out.println(coachSetter.getEmail());
        System.out.println(coachSetter.getBicepCircumference());
        context.close();
    }
}
