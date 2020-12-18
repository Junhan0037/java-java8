package com.java8to11.chapter06;

import java.util.concurrent.*;

public class App2 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService executorService = Executors.newSingleThreadExecutor();

        Callable<String> hello = () -> {
            Thread.sleep(1000L);
            return "Hello";
        };

        Future<String> helloFuture = executorService.submit(hello);
        System.out.println(helloFuture.isDone());
        System.out.println("Started!");

//        helloFuture.get();
        helloFuture.cancel(true);

        System.out.println(helloFuture.isDone());
        System.out.println("End!");
        executorService.shutdown();

    }
}
