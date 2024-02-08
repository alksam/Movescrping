package org.example.Threadsexercises;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class TaskExecutor {
    public static void main(String[] args) {
        //Opret en ExecutorService med 4 worker threads:
        ExecutorService executorService = Executors.newFixedThreadPool(4);

        // Submit tasks to the executor service
        for (char c = 'A'; c <= 'Z'; c++) {
            final char taskChar = c;
            executorService.submit(() -> printTask(taskChar));
        }

        // Shutdown the executor service
        executorService.shutdown();

        try {
            // Wait for all tasks to complete or timeout after 1 minute
            executorService.awaitTermination(1, TimeUnit.MINUTES);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static void printTask(char c) {
        String taskString = String.valueOf(c) + String.valueOf(c) + String.valueOf(c);
        System.out.println(taskString);
    }
}


