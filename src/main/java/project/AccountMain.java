package project;

import project.Account;

public class AccountMain {
    public static void main(String[] args) {
        Account account1 = new Account("Kravchenko Andrew Vitaliyevich", 51687, 22547);
        account1.printAccount();
        account1.depositAccount();
        account1.withdrawAccount();
        account1.transferAccount();
    }
}
