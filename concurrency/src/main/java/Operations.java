import java.util.concurrent.TimeUnit;

public class Operations {

    private static Object monitor = new Object();
    private static final int LOCK_WAIT_SEC = 5;

    public static void main(String[] args) throws InterruptedException {
        final Account a = new Account(1000, 1);
        final Account b = new Account(2000, 2);

        new Thread(() -> {
            try {
                transferWithLock(a, b, 500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
        transferWithLock(b, a, 300);

        System.out.println(a.getBalance());
        System.out.println(b.getBalance());
    }

    //deadlock
    static void transfer(Account acc1, Account acc2, int amount) {
        if (acc1.getBalance() < amount)
            throw new InsufficientFundsException();
        synchronized (acc1) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (acc2) {
                acc1.withdraw(amount);
                acc2.deposit(amount);
            }
        }
        System.out.println("Successful operation");
    }

    //решение дедлока с помощью иерархии(id)
    static void transferSolutionHierarchy(Account acc1, Account acc2, int amount) {
        if (acc1.getBalance() < amount)
            throw new InsufficientFundsException();
        Account synchronizedAccount = null;
        if (acc1.getId() > acc2.getId()) {
            synchronizedAccount = acc1;
        } else {
            synchronizedAccount = acc2;
        }
        synchronized (synchronizedAccount) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            acc1.withdraw(amount);
            acc2.deposit(amount);
        }
        System.out.println("Successful operation");
    }

    //решение дедлока с помощью дополнительного монитора
    static void transferWithAdditionalMonitor(Account acc1, Account acc2, int amount) {
        if (acc1.getBalance() < amount)
            throw new InsufficientFundsException();
        synchronized (monitor) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            acc1.withdraw(amount);
            acc2.deposit(amount);
        }
        System.out.println("Successful operation");
    }

    static void transferWithLock(Account acc1,
                                 Account acc2,
                                 int amount) throws InterruptedException {
        acc1.getLock().lock();
        try {
            if (acc1.getBalance() < amount)
                throw new InsufficientFundsException();
            acc2.getLock().lock();
            try {
                acc1.withdraw(amount);
                acc2.deposit(amount);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Successful operation");
            } finally {
                acc2.getLock().unlock();
            }

        } finally {
            acc1.getLock().unlock();
        }

    }

}
