package ru.job4j.collite;

import java.util.Comparator;
public class DepartmentsDescComparator implements Comparator<String> {

    @Override
    public int compare(String str1, String str2) {
        String[] partsFromStr1 = str1.split("/");
        String[] partsFromStr2 = str2.split("/");

        int length = Math.min(partsFromStr1.length, partsFromStr2.length);

        for (int i = 0; i < length; i++) {
            int result = partsFromStr2[i].compareTo(partsFromStr1[i]);
            if (result != 0) {
                return result;
            }
        }

        return Integer.compare(partsFromStr2.length, partsFromStr1.length);
    }
}
