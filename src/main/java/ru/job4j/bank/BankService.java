package ru.job4j.bank;

import java.util.*;

/**
 * БКласс банковский сервис, позволяет добавлят пользователя, удалять пользователя, добавлять аккаунт,
 * искать пользователя по паспорту, искать аккаунт по реквизитам, совершать денежные перводы с счёта на счёт и
 * получать аккаунты пользлвателя.
 * @author Evgeniy
 * @since 2025
 * @version 1.0
 * @ {@docRoot} somelink.html
 */
public class BankService {
    private final Map<User, List<Account>> users = new HashMap<>();

    /**
     * Mетод добавляет пользователя в users
     * @param user
     */
    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<>());
    }

    /**
     * Метод удаляет пользователя из users
     * @param passport
     */
    public void deleteUser(String passport) {
        users.remove(new User(passport, ""));
    }

    /**
     * Метод добавляет аккаунт пользователю.
     * @param passport
     * @param account
     */
    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        if (user != null) {
            List<Account> accountList = users.get(user);
            if (!accountList.contains(account)) {
                accountList.add(account);
            }
        }
    }

    /**
     * Метод ищет пользователя по паспорту.
     * @param passport
     * @return возвращает найденного пользователя.
     */
    public User findByPassport(String passport) {
        for (User user : users.keySet()) {
            if (user.getPassport().equals(passport)) {
                return user;
            }
        }
        return null;
    }

    /**
     * Метод ищет аккаунт по реквизитам
     * @param passport
     * @param requisite
     * @return возвращается найденный аккаунт
     */
    public Account findByRequisite(String passport, String requisite) {
        User user = findByPassport(passport);
        if (user != null) {
            List<Account> accountList = users.get(user);
            for (Account account : accountList) {
                if (account.getRequisite().equals(requisite)) {
                    return account;
                }
            }
        }
        return null;
    }

    /**
     * Метод переводит деньги с аккаунта на аккаунт
     * @param sourcePassport
     * @param sourceRequisite
     * @param destinationPassport
     * @param destinationRequisite
     * @param amount
     * @return возвращает true если перевод состоялся и false если одно из условий не позволило соверишь транзакицю
     */
    public boolean transferMoney(String sourcePassport, String sourceRequisite,
                                 String destinationPassport, String destinationRequisite,
                                 double amount) {
        Account sourceUserAccount = findByRequisite(sourcePassport, sourceRequisite);
        Account destinationUserAccount = findByRequisite(destinationPassport, destinationRequisite);
        if (sourceUserAccount == null
                || destinationUserAccount == null
                || (sourceUserAccount.getBalance() - amount) < 0
                || sourceUserAccount.equals(destinationUserAccount)) {
            return false;
        }
        sourceUserAccount.setBalance(sourceUserAccount.getBalance() - amount);
        destinationUserAccount.setBalance(destinationUserAccount.getBalance() + amount);

        return true;
    }

    /**
     * Получение списка аккаунтов пользователя
     * @param user
     * @return возвращается список аккаунтов
     */
    public List<Account> getAccounts(User user) {
        return users.get(user);
    }
}