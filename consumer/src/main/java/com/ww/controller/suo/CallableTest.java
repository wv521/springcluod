package com.ww.controller.suo;

import java.util.concurrent.Callable;

public class CallableTest implements Callable{


    @Override
    public Object call() throws Exception {
        System.out.println("123");
        return "123";
    }
}
