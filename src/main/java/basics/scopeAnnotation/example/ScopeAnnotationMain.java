package basics.scopeAnnotation.example;

import basics.common.ICoaching;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopeAnnotationMain {
    public static void main(String[] args){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("/annotationApplicationContext.xml");

        ICoaching coach3 = context.getBean("swimmingCoach", ICoaching.class);
        System.out.println(coach3.getWorkout());
        System.out.println(coach3.getAdvice());
        context.close();
    }
}
