package com.ww.threadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolTest {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.submit(new RunTest());
//        ThreadPoolExecutor tt = new ThreadPoolExecutor();
//        tt.execute();
    }
}
