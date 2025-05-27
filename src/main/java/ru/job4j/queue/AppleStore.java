package ru.job4j.queue;

import java.util.Queue;

public class AppleStore {
    private final Queue<Customer> queue;

    private final int count;

    public AppleStore(Queue<Customer> queue, int count) {
        this.queue = queue;
        this.count = count;
    }

    public String getLastHappyCustomer() {
        String lastHappyCustomers = "";
        for (int i = 1; i <= count; i++) {
            lastHappyCustomers = queue.poll().name();
        }
        return lastHappyCustomers;
    }

    public String getFirstUpsetCustomer() {
        int upset = 1;
        String lastHappyCustomers = "";
        for (int i = 1; i <= count + upset; i++) {
            lastHappyCustomers = queue.poll().name();
        }
        return lastHappyCustomers;
    }
}