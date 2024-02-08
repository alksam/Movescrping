package org.example.Threadsexercises;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class opgave4 {
public static void main(String[] args){
    int antalkerne = Runtime.getRuntime().availableProcessors();
    ExecutorService ss = Executors.newFixedThreadPool(antalkerne);

    TalList integerList = new TalList();
    CountDownLatch latch = new CountDownLatch(10);
    for (int count = 0; count < 10; count++) {
        ss.submit(new TaskToAddCount(integerList, count));
    }

    try {
        latch.await();
    } catch (InterruptedException e) {
        e.printStackTrace();
    }

    ss.shutdown();



}



private static class TalList {
    private static List<Integer> list = new ArrayList<>();

    public void addCount(int count) {
        list.add(count);
        System.out.println("Task: " + count + ": List size = " + list.size());
    }
}
private static class TaskToAddCount implements Runnable {
    // Gets a reference to the shared list and the count to add
    private TalList integerList;
    private int count;

    TaskToAddCount(TalList integerList, int count) {
        this.integerList = integerList;
        this.count = count;
    }

    @Override
    public void run() {
        try {
            Thread.sleep((int) (Math.random() * 800 + 200));
            integerList.addCount(count);
        } catch (InterruptedException ex) {
            System.out.println("Thread was interrupted");
        }
    }
}
}
