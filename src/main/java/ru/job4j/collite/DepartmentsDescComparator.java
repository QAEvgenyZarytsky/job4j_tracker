package ru.job4j.collite;

import java.util.Comparator;

public class DepartmentsDescComparator implements Comparator<String> {

    @Override
    public int compare(String str1, String str2) {
        String[] partsFromStr1 = str1.split("/");
        String[] partsFromStr2 = str2.split("/");

        int result = partsFromStr2[0].compareTo(partsFromStr1[0]);
        return result != 0 ? result : str1.compareTo(str2);
    }
}
