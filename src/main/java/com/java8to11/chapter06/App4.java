package com.java8to11.chapter06;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class App4 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
            System.out.println("Hello " + Thread.currentThread().getName());
            return "Hello";
        }).thenApply(s -> {
            System.out.println(Thread.currentThread().getName());
            return s.toUpperCase();
        });
        System.out.println(future.get());

        System.out.println("============================");

        CompletableFuture<Void> future2 = CompletableFuture.supplyAsync(() -> {
            System.out.println("Hello " + Thread.currentThread().getName());
            return "Hello";
        }).thenAccept(s -> {
            System.out.println(Thread.currentThread().getName());
            System.out.println(s.toUpperCase());
        });
        System.out.println(future2.get());

        System.out.println("============================");

        CompletableFuture<Void> future3 = CompletableFuture.supplyAsync(() -> {
            System.out.println("Hello " + Thread.currentThread().getName());
            return "Hello";
        }).thenRun(() -> {
            System.out.println(Thread.currentThread().getName());
        });
        System.out.println(future3.get());
    }
}
