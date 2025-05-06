package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        String nameFromEx = "Clean code";
        Book book1 = new Book(451, nameFromEx);
        Book book2 = new Book(231, "Two name");
        Book book3 = new Book(123, "Three name");
        Book book4 = new Book(235, "Fore name");
        Book[] arrayOfBooks = new Book[4];
        arrayOfBooks[0] = book1;
        arrayOfBooks[1] = book2;
        arrayOfBooks[2] = book3;
        arrayOfBooks[3] = book4;

        for (Book book : arrayOfBooks) {
            System.out.println(book.getName() + " - " + book.getCountStr());
        }
        Book temp = arrayOfBooks[3];
        arrayOfBooks[3] = arrayOfBooks[0];
        arrayOfBooks[0] = temp;

        System.out.println();

        for (Book book : arrayOfBooks) {
            System.out.println(book.getName() + " - " + book.getCountStr());
        }
        System.out.println();

        for (Book book : arrayOfBooks) {
            if (book.getName().equals(nameFromEx)) {
                System.out.println(book.getName() + " - " + book.getCountStr());
            }
        }
    }
}
