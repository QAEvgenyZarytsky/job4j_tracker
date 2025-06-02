package ru.job4j.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class FI {
    public static void main(String[] args) {
        Attachment[] attachments = {
                new Attachment("image 1", 20),
                new Attachment("image 3", 120),
                new Attachment("image 2", 23)
        };
        Comparator<Attachment> comparator = new Comparator<Attachment>() {
            @Override
            public int compare(Attachment left, Attachment right) {
                return Integer.compare(left.getSize(), right.getSize());
            }
        };
        Arrays.sort(attachments, comparator);

        Comparator<String> comparatorText = (str1, str2) -> str1.compareTo(str2);
        Comparator<String> comparatorDescSize = (str1, str2) -> Integer.compare(str2.length(), str1.length());

        List<String> listStr1 = Arrays.asList(
                new String("Zne"),
                new String("Wne"),
                new String("One"),
                new String("Ane"),
                new String("Cne"),
                new String("Zae")
        );
        Collections.sort(listStr1, comparatorText);
        for (String str : listStr1) {
            System.out.println(str);
        }
        System.out.println();
        List<String> listStr2 = Arrays.asList(
                new String("Ce"),
                new String("C"),
                new String("Wqwene"),
                new String("Oqne"),
                new String("Ane"),
                new String("Zaeqwee"),
                new String("Znqwere")
        );
        Collections.sort(listStr2, comparatorDescSize);
        for (String str : listStr2) {
            System.out.println(str);
        }
    }
}

