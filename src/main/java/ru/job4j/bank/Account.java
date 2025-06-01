package ru.job4j.bank;

import java.util.Objects;

/**
 * Класс аккаунт представляет собой аккаунты полльзователя с реквизитами и балансом
 */
public class Account {
    private String requisite;
    private double balance;

    public Account(String requisite, double balance) {
        this.requisite = requisite;
        this.balance = balance;
    }

    /**
     *  Метод для получения реквизитов акканта пользователя.
     * @return
     */
    public String getRequisite() {
        return requisite;
    }

    /**
     * Метод для сохранения реквизитов пользователя.
     * @param requisite
     */
    public void setRequisite(String requisite) {
        this.requisite = requisite;
    }

    /**
     * Метод для получения баланса аккаунта
     * @return
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Метод для сохранения баланса пользователя.
     * @param balance
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Account account = (Account) o;
        return Objects.equals(requisite, account.requisite);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requisite);
    }
}