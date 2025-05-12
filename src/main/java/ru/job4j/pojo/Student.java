package ru.job4j.pojo;

import java.util.Date;

public class Student {
    private String name;
    private String surname;
    private String middleName;
    private int group;
    private Date startStudy;

    public Date getStartStudy() {
        return startStudy;
    }

    public void setStartStudy(Date startStudy) {
        this.startStudy = startStudy;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
