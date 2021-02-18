package com.ww.controller.spring.event;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EvenTest {

    public static void main(String[] args) {
        ApplicationContext cxt = new AnnotationConfigApplicationContext(ServiceEvent.class);
        ServiceEvent bean = cxt.getBean(ServiceEvent.class);
        bean.sendMessage("第一次发布事件");
//        ClassPathXmlApplicationContext cxt = new
//                ClassPathXmlApplicationContext("SpringEvent.xml");
//        ServiceEvent bean = cxt.getBean(ServiceEvent.class);
//        bean.sendMessage("第一次发布事件");
//        MyListener myListener = new MyListener();
//        myListener.publishEvent(myEvent);
    }
}
