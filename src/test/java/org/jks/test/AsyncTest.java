package org.jks.test;

import java.util.concurrent.CompletableFuture;

/**
 * Created by turan on 2017/7/26 0026.
 */
public class AsyncTest {

    public static void main(String args[]){
        CompletableFuture.runAsync(()->{
            System.out.println("hello");
        });
        System.out.println("world");
    }
}
