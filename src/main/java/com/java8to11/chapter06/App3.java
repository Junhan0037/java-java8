package com.java8to11.chapter06;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

public class App3 {
    public static void main(String[] args) throws InterruptedException, ExecutionException {

        ExecutorService executorService = Executors.newSingleThreadExecutor();

        Callable<String> hello = () -> {
            Thread.sleep(2000L);
            return "Hello";
        };

        Callable<String> java = () -> {
            Thread.sleep(3000L);
            return "Java";
        };

        Callable<String> junhan = () -> {
            Thread.sleep(1000L);
            return "Junhan";
        };

        List<Future<String>> futures = executorService.invokeAll(Arrays.asList(hello, java, junhan));
        for (Future<String> future : futures) {
            System.out.println(future.get());
        }

        executorService.shutdown();
    }
}
