import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Account {
    private int balance;
    private int id;
    private Lock lock;
    private int failCounter;

    public Account(int balance, int id) {
        this.balance = balance;
        this.id = id;
        lock = new ReentrantLock();
    }

    public void withdraw(int amount) {
        balance -= amount;
    }

    public void deposit(int amount) {
        balance += amount;
    }

    public int getBalance() {
        return balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Lock getLock() {
        return lock;
    }

    public void incFailCounter() {
        failCounter++;
    }

    public int getFailCounter() {
        return failCounter;
    }
}
