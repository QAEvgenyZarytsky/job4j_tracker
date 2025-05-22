package ru.job4j.singleton;

public class Main {
    public static void main(String[] args) {
        Log4File log4File = Log4File.init("123");
        log4File.pr();
    }
}
