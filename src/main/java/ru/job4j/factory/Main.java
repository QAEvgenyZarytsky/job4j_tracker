package ru.job4j.factory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ans = scanner.nextLine();
        Factory factory = null;

        switch (ans) {
            case "truck":
                factory = new RoadOperator();
                break;
            case "ship":
                factory = new SeaOperator();
            default:
                System.out.println("Invalid param");
                break;
        }

        Logistic logistic = new Logistic(factory);
        logistic.demonstrate();
    }
}
