package com.ww.controller.spring.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
@Configuration
@ComponentScan("com.ww.controller.spring.event")
public class ServiceEvent implements ApplicationEventPublisherAware {

    // ApplicationEventPublisher 封装事件发布的接口
    @Autowired
    private ApplicationEventPublisher publisher;



    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {
        System.out.println(publisher);
        this.publisher = publisher;
    }

    public ApplicationEventPublisher getPublisher() {
        return publisher;
    }

    public void sendMessage(String name){
        publisher.publishEvent(new MyEvent(name));
    }
}
