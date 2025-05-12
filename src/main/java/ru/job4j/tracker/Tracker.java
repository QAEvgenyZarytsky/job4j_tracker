package ru.job4j.tracker;

import java.util.Arrays;
import java.util.Objects;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item findById(int id) {
        Item result = null;
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (item.getId() == id) {
                result = item;
                break;
            }
        }
        return result;
    }

    public Item[] findAll() {
        Item[] rsl = new Item[items.length];
        int size = 0;
        for (int i = 0; i < items.length; i++) {
            if (items[i] != null) {
                rsl[size] = items[i];
                size++;
            }
        }
        return Arrays.copyOf(rsl, size);
    }

    public Item[] findByName(String key) {
        Item[] rsl = new Item[items.length];
        int size = 0;
        for (Item item : items) {
            if (item != null && item.getName().equals(key)) {
                rsl[size] = item;
                size++;
            }
        }
        return Arrays.copyOf(rsl, size);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Tracker tracker = (Tracker) o;
        return ids == tracker.ids && size == tracker.size && Objects.deepEquals(items, tracker.items);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Arrays.hashCode(items), ids, size);
    }
}