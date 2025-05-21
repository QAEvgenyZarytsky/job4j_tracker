package ru.job4j.ex;

public class FindEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int result = -1;
        for (int i = 0; i < value.length; i++) {
            if (value[i].equals(key)) {
                result = i;
            }
        }
        if (result == -1) {
            throw new ElementNotFoundException("Array doesn't contains key.");
        }
        return result;
    }

    public static void main(String[] args) {
        String[] array = new String[]{"one", "two", "three", "four", "five"};
        String key = "test";
        try {
            int index = indexOf(array, key);
            System.out.println(index);
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }
}
