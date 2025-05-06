package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Ivan");
        student.setSurname("Ivanovich");
        student.setMiddleName("Ivanov");
        student.setGroup(451);
        student.setStartStudy(new Date());

        System.out.println("Информация о студенте: Имя:" + student.getName() + ", " + "Отчество: "
                + student.getSurname() + ", " + "Дата поступления: " + student.getStartStudy());
    }
}
