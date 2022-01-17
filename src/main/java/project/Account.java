package project;

import java.io.IOException;
import java.util.Scanner;
import java.util.Date;

public class Account {
    private String nameOwner;
    private int numbersAccount;
    private int moneyForAccount;
    private Operations [] prodArray;

    private class Operations {
        private int withdraw;
        private int deposit;
        private int transfer;

        public Operations(int withdraw, int deposit, int transfer) {
            this.withdraw = withdraw;
            this.deposit = deposit;
            this.transfer = transfer;
        }

        public int getWithdraw() {
            return withdraw;
        }
        public int getDeposit() {
            return deposit;
        }
        public int getTransfer() {
            return transfer;
        }
    }

    public Account(String nameOwner, int numbersAccount, int moneyForAccount) {
        this.nameOwner = nameOwner;
        this.numbersAccount = numbersAccount;
        this.moneyForAccount = moneyForAccount;
    }

    public String getNameOwner() {
        return nameOwner;
    }
    public int getNumbersAccount() {
        return numbersAccount;
    }
    public int getMoneyForAccount() {
        return moneyForAccount;
    }

    public void printAccount() {
        System.out.println("Owner account: " + getNameOwner());
        System.out.println("Numbers account: " + getNumbersAccount());
        System.out.println("Money for account: " + getMoneyForAccount());
    }

    public void depositAccount() {
        System.out.println("How much do you wont to deposit: ");
        Scanner scanner = new Scanner(System.in);
        int sum = scanner.nextInt();
        int sum2 = getMoneyForAccount() + sum;
        System.out.println("Now in the account: " + sum2);
    }

    public void withdrawAccount() {
        System.out.println("How much do you want to withdraw: ");
        Scanner scanner = new Scanner(System.in);
        int sum = scanner.nextInt();
        int sum2 = getMoneyForAccount() - sum;
        System.out.println("Now in the account: " + sum2);
    }

    public void transferAccount() {
        System.out.println("Dial the account number to which you want to transfer the amount: ");
        Scanner scanner = new Scanner(System.in);
        int sum = scanner.nextInt();
        System.out.println("Money transfer.");
    }
}
