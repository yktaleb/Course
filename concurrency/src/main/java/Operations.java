public class Operations {

    private static Object monitor = new Object();

    public static void main(String[] args) {
        final Account a = new Account(1000, 1);
        final Account b = new Account(2000, 2);

        new Thread(() -> transferWithAdditionalMonitor(a, b, 500)).start();
        transferWithAdditionalMonitor(b, a, 300);
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


}
