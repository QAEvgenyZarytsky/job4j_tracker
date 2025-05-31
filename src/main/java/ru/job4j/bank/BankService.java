package ru.job4j.bank;

import java.util.*;

public class BankService {
    private final Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<>());
    }

    public void deleteUser(String passport) {
        users.remove(new User(passport, ""));
    }

    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        if (user != null) {
            List<Account> accountList = users.get(user);
            if (!accountList.contains(account)) {
                accountList.add(account);
            }
        }
    }

    public User findByPassport(String passport) {
        for (User user : users.keySet()) {
            if (user.getPassport().equals(passport)) {
                return user;
            }
        }
        return null;
    }

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

    public List<Account> getAccounts(User user) {
        return users.get(user);
    }
}