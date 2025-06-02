package ru.job4j.lambda;

import ru.job4j.collection.JobAscByPriority;

import java.util.*;

public class AttachmentSort {
    public static void main(String[] args) {
        List<Attachment> attachmentList = Arrays.asList(
                new Attachment("image1", 100),
                new Attachment("image2", 34),
                new Attachment("image3", 13)
        );
        Comparator<Attachment> comparator = new Comparator<Attachment>() {
            @Override
            public int compare(Attachment left, Attachment right) {
                return Integer.compare(left.getSize(), right.getSize());
            }
        };

        ArrayList<Integer> list = new ArrayList<Integer>() {
            @Override
            public boolean add(Integer o) {
                System.out.println("Add a new element to list: " + o);
                return super.add(o);
            }
        };

        Collections.sort(attachmentList, comparator);
        Collections.sort(attachmentList, new AttachmentSortComp());

        Comparator<Attachment> attachmentComparatorForName = new Comparator<Attachment>() {
            @Override
            public int compare(Attachment o1, Attachment o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };
        List<Attachment> attachmentListWithDifName = Arrays.asList(
                new Attachment("image9", 100),
                new Attachment("image4", 34),
                new Attachment("image1", 13),
                new Attachment("image0", 13),
                new Attachment("image6", 13)
        );
        Collections.sort(attachmentListWithDifName, attachmentComparatorForName);
        for (Attachment str : attachmentListWithDifName) {
            System.out.println("Name is " + str.getName());
        }
    }
}
