package ru.job4j.oop;

public class Error {
    private boolean active;
    private int status;
    private String message;

    public Error() {

    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public void printInfo() {
        System.out.println("Действия вызвали ошибку: " + active);
        System.out.println("Статус ошибки: " + status);
        System.out.println("Сообщение об ошибке: " + message);
    }

    public static void main(String[] args) {
        Error error1 = new Error();
        Error error2 = new Error(true, 401, "Unauthorized");
        Error error3 = new Error(true, 400, "Bad Request");
        Error error4 = new Error(true, 403, "Forbidden");
        error1.printInfo();
        error2.printInfo();
        error3.printInfo();
        error4.printInfo();

    }
}
