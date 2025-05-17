package ru.job4j.concat;

public class ConcatTest {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        StringBuilder string = new StringBuilder("Job4j");
        for (int index = 0; index < 9999; index++) {
            string.append(index);
        }
        System.out.println("Миллисекунд: " + (System.currentTimeMillis() - startTime));

        String string1 = "abc".concat("def").concat("ghi").concat("jkl");
        System.out.println(string1);

        String string2 = String.join(" ", "abc", "def", "ghi");
        System.out.println(string2);
    }
}
