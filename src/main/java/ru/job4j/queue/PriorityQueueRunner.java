package ru.job4j.queue;

import java.util.PriorityQueue;

public class PriorityQueueRunner {
    public static void main(String[] args) {
        PriorityQueue<String> stringQueue = new PriorityQueue<>();
        stringQueue.offer("f");
        stringQueue.offer("a");
        stringQueue.offer("s");
        stringQueue.offer("e");
        printStringElements(stringQueue);
        System.out.println();
        System.out.println();
        PriorityQueue<Transaction> transactions = new PriorityQueue<>(new TransactionSortDescByAmount());
        transactions.offer(new Transaction(1, "number_1", 100));
        transactions.offer(new Transaction(2, "number_2", 1000));
        transactions.offer(new Transaction(3, "number_3", 85));
        transactions.offer(new Transaction(4, "number_4", 550));
        printTransactionElements(transactions);
        System.out.println();
        System.out.println("With transaction");
        System.out.println();
        PriorityQueue<String> stringQueue1 = new PriorityQueue<>();
        stringQueue1.offer("f");
        stringQueue1.offer("a");
        stringQueue1.offer("s");
        stringQueue1.offer("e");
        System.out.println("Current element: " + stringQueue1.poll());
        stringQueue1.poll();
        System.out.println("Current element: " + stringQueue1.poll());
        System.out.println();
        System.out.println();
        PriorityQueue<Transaction> transactions1 = new PriorityQueue<>(new TransactionSortDescByAmount());
        transactions1.offer(new Transaction(1, "number_1", 100));
        transactions1.offer(new Transaction(2, "number_2", 1000));
        transactions1.offer(new Transaction(3, "number_3", 85));
        transactions1.offer(new Transaction(4, "number_4", 550));
        System.out.println("Current element: " + transactions1.peek());
        System.out.println("Current element: " + transactions1.peek());
        transactions1.poll();
        System.out.println("Current element: " + transactions1.peek());
        transactions1.poll();
        System.out.println("Current element: " + transactions1.peek());
    }

    private static void printStringElements(PriorityQueue<String> queue) {
        while (!queue.isEmpty()) {
            System.out.println("Current element: " + queue.poll());
        }
    }

    private static void printTransactionElements(PriorityQueue<Transaction> queue) {
        while (!queue.isEmpty()) {
            System.out.println("Current element: " + queue.poll());
        }
    }
}
