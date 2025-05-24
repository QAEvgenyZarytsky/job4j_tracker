package ru.job4j.collection;

import java.util.List;

public class ConvertList2Array {
    public static int[][] toArray(List<Integer> list, int cells) {
        int groups = (int) Math.ceil((double) list.size() / cells);
        int[][] array = new int[groups][cells];
        int row = 0;
        int cell = 0;
        for (Integer number : list) {
            if (cell < cells) {
                array[row][cell] = number;
                cell++;
            } else {
                row++;
                cell = 0;
                array[row][cell] = number;
                cell++;
            }

        }
        return array;
    }
}
