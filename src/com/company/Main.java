package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Account account = new Account();

        System.out.println("         ************ Welcome to Arlen Bank *************");

        System.out.println("" +
                "        1. Create new account\n" +
                "        2. Display balance amount\n" +
                "        3. Deposit money\n" +
                "        4. Withdraw money\n" +
                "        5. Exit");
        System.out.println("         ************ Welcome to Arlen Bank *************        ");

        while (true) {
            System.out.println("<----------------------------------------------------------------------------------------->");
            System.out.println("                   Choose operation:                ");
            int num = scanner.nextInt();
            System.out.println("<----------------------------------------------------------------------------------------->");

            switch (num) {
                case 1:
                    account.getUserDetails();
                    break;
                case 2:
                    if (account.isAccountExists()) {
                        account.showBalance();
                    } else {
                        System.out.println("<------------------------------ No account------------------------->");
                    }
                    break;
                case 3:
                    if (account.isAccountExists())
                        account.depositMain();
                    else {
                        System.out.println("<----------------------------- No account--------------------------->");
                    }
                    break;
                case 4:
                    if (account.isAccountExists()) {
                        account.withdrawMethod();
                        System.out.println("<------------------Success withdraw!!! ----------------->");
                    } else {
                        System.out.println("<----------------------- No account--------------->");
                    }
                    break;
                case 5:
                    System.exit(0);
            }
        }
    }
}
