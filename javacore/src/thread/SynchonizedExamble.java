package thread;


/**
 * vi du ve synchonous: 2 thread thao tac tren cung mot object account
 * sử dụng từ khóa synchonized để đảm bảo răng chỉ có duy nhất một thread được thao tác trên object tại một
 * thời điểm
 *
 */
public class SynchonizedExamble implements Runnable {


    private Account acct = new Account();

    public static void main(String[] args) {
        SynchonizedExamble r = new SynchonizedExamble();
        Thread one = new Thread(r);

        Thread two = new Thread(r);
        one.setName("Fred");
        two.setName("Lucy");
        one.start();
        two.start();
    }

    @Override
    public void run() {
        for (int x = 0; x < 5; x++) {
            makeWithdrawal(10);
            if (acct.getBalance() < 0) {
                System.out.println("account is overdrawn!");
            }
        }
    }

    private synchronized void makeWithdrawal(int amt) {
        if (acct.getBalance() >= amt) {

            try {
                System.out.println(Thread.currentThread().getName() + " is going to withdraw");
                Thread.sleep(500);
            } catch (InterruptedException ex) {
            }
            acct.withdraw(amt);
            System.out.println(Thread.currentThread().getName() + "completes the withdrawal");
        } else {
            System.out.println("Not enough in account for "
                    + Thread.currentThread().getName()
                    + " to withdraw " + acct.getBalance());
        }
    }
}


/**
 * class account chua 2 method getBalance va withDraw dung de lay va cap nhat balance
 */
class Account {
    private int balance = 50;

    public int getBalance() {
        return balance;
    }

    public void withdraw(int amount) {
        balance = balance - amount;
    }
}
