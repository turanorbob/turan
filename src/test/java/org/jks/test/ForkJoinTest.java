package org.jks.test;

import com.sun.xml.internal.ws.util.CompletedFuture;

import java.io.IOException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ForkJoinPool;

/**
 * Created by turan on 2017/8/1 0001.
 */
public class ForkJoinTest {

    public static void main(String args[]) throws IOException {
        for(int i=0; i<10000; i++){
            final int k=i;
            CompletableFuture.runAsync(() -> {
                for (int j = k; j < 1000000; j += 100) {
                    try {
                        System.out.println(Thread.currentThread().getName()+":"+j);
                        Thread.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
        }
        System.out.println("game over");
        System.in.read();
    }
}
