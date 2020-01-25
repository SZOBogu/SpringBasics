package AnnotationBasics;

import common.ICoaching;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationMain {
    public static void main(String[] args){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("annotationApplicationContext.xml");

        ICoaching coach = context.getBean("TomekH", ICoaching.class);
        System.out.println(coach.getWorkout());

        context.close();
    }
}
