package test;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("resources/applicationContext.xml");
        context.getBean("hello");
        context.getBean("hai");
        context.getBean("wish");
    }
}
