package ru.job4j.singleton;

public final class Log4File {
    String value;
    private static Log4File instance = null;

    private Log4File(String value) {
        this.value = value;
    }

    public static Log4File init(String value) {
        if (instance == null) {
            instance = new Log4File(value);
        }
        return instance;
    }

    public void pr() {
        System.out.println(value);
    }
}
