package ru.job4j.ex;

public class FindEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int result = -1;
        for (int i = 0; i < value.length; i++) {
            if (value[i].equals(key)) {
                result = i;
                break;
            }
        }
        if (result == -1) {
            throw new ElementNotFoundException("Array doesn't contains key.");
        }
        return result;
    }

    public static boolean sent(String value, String[] abuses) throws ElementAbuseException {
        /* if contains throw ElementAbuseException */
        return true;
    }

    public static void process(String[] values, String key, String[] abuses) {
        try {
            if (indexOf(values, key) != -1) {
                sent(key, abuses);
            }
        } catch (ElementAbuseException ea) {
            ea.printStackTrace();
        } catch (ElementNotFoundException en) {
            en.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        String[] array = new String[]{"one", "two", "three", "four", "five"};
        String key = "two";
        try {
            int index = indexOf(array, key);
            System.out.println(index);
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }
}
