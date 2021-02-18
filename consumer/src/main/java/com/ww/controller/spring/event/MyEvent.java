package com.ww.controller.spring.event;

import org.springframework.context.ApplicationEvent;

public class MyEvent extends ApplicationEvent{

    private String name;

    private String age;

    public MyEvent(Object source, String name, String age) {
        super(source);
        this.name = name;
        this.age = age;
    }

    public MyEvent(Object source) {
        super(source);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
