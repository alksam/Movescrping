package org.example.Threadsexercises;

public class Counter {

private static class Counte1 {
    private int count = 0;

    // Method to increment the count, synchronized to ensure thread safety
    public synchronized void increment() {
        count++;
    }

    // Method to retrieve the current count value
    public synchronized int getCount() {
        return count;
    }
}}