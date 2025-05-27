package ru.job4j.collection;

import java.util.HashSet;

public class UniqueText {
    public boolean isEquals(String originText, String duplicateText) {
        boolean result = true;
        String[] origin = originText.split(" ");
        String[] text = duplicateText.split(" ");
        HashSet<String> check = new HashSet<>();
        for (String str : origin) {
            check.add(str);
        }
        HashSet<String> ourText = new HashSet<>();
        for (String str : text) {
            ourText.add(str);
        }
        for (String str : check) {
            if (!ourText.contains(str)) {
                result =  false;
                break;
            }
        }
        return result;
    }
}
