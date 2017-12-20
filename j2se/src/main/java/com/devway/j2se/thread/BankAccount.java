package com.devway.j2se.thread;

/**
 * BankAccount class
 *
 * @author devway
 * @date 2017-12-11
 */
public class BankAccount {
    private long number;
    private long balance;

    public BankAccount(long balance) {
        this.balance = balance;
    }

    public synchronized long getBlance() {
        return balance;
    }

    public synchronized void deposit(long amount) {
        balance += amount;
    }
}
