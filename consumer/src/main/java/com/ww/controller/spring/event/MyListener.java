package com.ww.controller.spring.event;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class MyListener implements ApplicationListener<MyEvent>{

    @Override
    public void onApplicationEvent(MyEvent myEvent) {
        System.out.println("say:"+ myEvent);
    }

}
