package com.ww.spi.javaSpi;

import com.ww.spi.javaSpi.Roto;

import java.util.ServiceLoader;

public class SpiTest {

    public static void main(String[] args) {
        ServiceLoader<Roto> load = ServiceLoader.load(Roto.class);
        for (Roto r : load){
            r.sayHello();
//                        System.out.println(r);
        }
    }
}
