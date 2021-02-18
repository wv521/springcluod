package com.ww.controller.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by ww on 2020/3/23.
 */
public class SpringTest {

    public static void main(String[] args) {
//        ClassPathXmlApplicationContext cc =  new ClassPathXmlApplicationContext("beans.xml");
//        ClassPathXmlApplicationContext cc =  new ClassPathXmlApplicationContext("test.xml");
        ClassPathXmlApplicationContext cc =  new ClassPathXmlApplicationContext("beanPostProcesses.xml");
        StudentBeanPostProcesses bean = cc.getBean(StudentBeanPostProcesses.class);
//        MobileBeanFactoryPostProcessor mm = new MobileBeanFactoryPostProcessor();
//
//        cc.addBeanFactoryPostProcessor(mm);
//        cc.addBeanFactoryPostProcessor(new CarBeanFactoryPostProcessor1());
//        cc.addBeanFactoryPostProcessor(new CarBeanFactoryPostProcessor2());
//        cc.refresh();
//
//        Car car = cc.getBean(Car.class);
//        System.out.println("我是名称："+car.getName()+"-----------"+"我是颜色："+car.getColor());
//        Mobile mobile = (Mobile) cc.getBean("mobile");
//        System.out.println(mobile.getNumber());
    }
}
