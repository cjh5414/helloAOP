package kr.ac.hansung.spring.aop;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by jihun on 2017. 1. 24..
 */
public class MainApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("beans/animal.xml");

        PetOwner person = (PetOwner) context.getBean("petOwner");
        person.play();

        context.close();
    }
}
