package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.List;

public class Tracker {
    private final List<Item> items = new ArrayList<>();
    private int ids = 1;
    private int size = 0;

    public void delete(int id) {
        int start = indexOf(id);
        boolean check = start != -1;
        if (start != -1) {
            items.remove(start);
            size--;
        }
    }

    public Item add(Item item) {
        item.setId(ids++);
        items.add(size++, item);
        return item;
    }

    public Item findById(int id) {
        int index = indexOf(id);
        return index != -1 ? items.get(index) : null;
    }

    public boolean replace(int id, Item item) {
        int index = indexOf(id);
        boolean result = index != -1;
        if (result) {
            item.setId(id);
            items.set(index, item);
        }
        return result;
    }

    public List<Item> findAll() {
        List<Item> resultList = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            resultList.add(items.get(i));
        }
        return resultList;
    }

    public List<Item> findByName(String key) {
        List<Item> rsl = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            if (items.get(i).getName().equals(key)) {
                rsl.add(items.get(i));
            }
        }
        return rsl;
    }

    private int indexOf(int id) {
        int result = -1;
        for (int index = 0; index < size; index++) {
            if (items.get(index).getId() == id) {
                result = index;
                break;
            }
        }
        return result;
    }
}