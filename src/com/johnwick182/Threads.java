package com.johnwick182;

import java.security.SecureRandom;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Threads implements Runnable {
    private static final SecureRandom generator = new SecureRandom();
    private final int sleepTime;
    private final String taskName;

    public Threads(String taskName) {
        this.taskName = taskName;
        sleepTime = generator.nextInt(5000);
    }

    @Override
    public void run() {
    try {
        System.out.println("thread" + taskName + sleepTime);
        Thread.sleep(sleepTime);
    } catch(InterruptedException exception) {
        exception.printStackTrace();
        Thread.currentThread().interrupt();
    }
        System.out.println("end thread" + taskName);
    }
}

class Testing {
    public static void main(String[] args) {
        Threads t1 = new Threads("t1");
        Threads t2 = new Threads("t2");
        Threads t3 = new Threads("t3");

        System.out.println("Starting executor");

        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.execute(t1);
        executorService.execute(t2);
        executorService.execute(t3);
        executorService.shutdown();

    }
}
