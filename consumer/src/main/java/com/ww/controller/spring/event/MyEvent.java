package com.ww.controller.spring.event;

import org.springframework.context.ApplicationEvent;

public class MyEvent extends ApplicationEvent{
    public MyEvent(Object source) {
        super(source);
    }
}
