package scopeAnnotation.example;

import common.ICoaching;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopeAnnotationMain {
    public static void main(String[] args){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("annotationApplicationContext.xml");

        ICoaching coach1 = context.getBean("footballCoach", ICoaching.class);
        ICoaching coach2 = context.getBean("footballCoach", ICoaching.class);

        System.out.println(coach1 == coach2);

        context.close();
    }
}
