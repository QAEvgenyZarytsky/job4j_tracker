package ru.job4j.tracker;

import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public void delete(int id) {
        if (id < 0) {
            System.out.println("This ID is invalid. ID cann't be negative.");
        } else if (size == 0) {
            System.out.println("This array is empty.");
        } else {
            int start = indexOf(id);
            if (start != -1) {
                System.arraycopy(items, start + 1, items, start, size - start - 1);
                items[size - 1] = null;
                size--;
            } else {
                System.out.println("Item not found.");
            }
        }
    }

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item findById(int id) {
        int index = indexOf(id);
        return index != -1 ? items[index] : null;
    }

    public boolean replace(int id, Item item) {
        if (id < 0) {
            System.out.println("This ID is invalid. ID cann't be negative.");
        } else if (item == null) {
            System.out.println("Item cann't be null");
        } else {
            int index = indexOf(id);
            if (index == -1) {
                return false;
            }
            item.setId(id);
            items[index] = item;
        }
        return true;
    }

    public Item[] findAll() {
        return Arrays.copyOf(items, size);
    }

    public Item[] findByName(String key) {
        Item[] rsl = new Item[items.length];
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (items[i].getName().equals(key)) {
                rsl[count] = items[i];
                count++;
            }
        }
        return Arrays.copyOf(rsl, count);
    }

    private int indexOf(int id) {
        int result = -1;
        for (int index = 0; index < size; index++) {
            if (items[index].getId() == id) {
                result = index;
                break;
            }
        }
        return result;
    }
}