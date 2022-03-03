package com.company;

import java.util.Scanner;

public class Account {
    Scanner sc = new Scanner(System.in);
    private double balance;
    private String accHolderName;
    private int accHolderPhoneNo;
    private double withdrawAmount;
    private boolean accountExists;
    private String accHolderIFSCCode;
    private Operation operation;
    private double deposit;

    static final double MINIMUM_BALANCE = 1000.0;
    static final double DAILY_WITHDRAW_LIMIT = 5000.0;

    public Account(){
        this.balance=0;
        this.withdrawAmount = 0.0;
        this.accountExists = false;

    }
    String  readAccHolderName() {
        System.out.println("                          Enter name:                    ");
        String name = sc.nextLine();
        System.out.println("<----------------------------------------------------------------------------------------->");
        return name;
    }
    int readAccHolderPhone() {
        System.out.println("                    Enter phone number:     ");
        int phone = sc.nextInt();
        System.out.println("<----------------------------------------------------------------------------------------->");
        return phone;
    }
    void createNewAccount() {
        getUserDetails();
    }
    void getUserDetails() {
        accHolderName = readAccHolderName();
        accHolderPhoneNo = readAccHolderPhone();
        warningMessage();
        deposit = readDeposit();
        if (this.deposit < MINIMUM_BALANCE) {
            System.out.println("<----------------------------------------------------------------------------------------->");
            System.out.println("             NOT ENOUGH MONEY!!!         ");
            System.out.println("<----------------------------------------------------------------------------------------->");
        } else {
            setBalance(deposit);
            setAccountExists(true);
            accountCreatedMessage();
        }
    }
    void depositMain() {
        int depositEnter = readDeposit();
        balance += depositEnter;
        System.out.println("                     Add deposit Success                                             ");
        Operation operation = new Operation("Deposit", depositEnter);
        System.out.println(operation.dateOperation());
    }
    void withdrawMethod() {
        System.out.println("                    Enter withdraw:                   ");
        int withdrawEnter = sc.nextInt();
        System.out.println("<----------------------------------------------------------------------------------------->");
        double afterWithdraw = getBalance() - withdrawEnter;
        setBalance(afterWithdraw);
        System.out.println(afterWithdraw);
        Operation operationWithdraw = new Operation("Withdraw", withdrawEnter);
        System.out.println(operationWithdraw.dateOperation());
    }
    void accountCreatedMessage() {
        System.out.println("<----------------------------------------------------------------------------------------->");
        System.out.println("                  Account created successuful                            ");
        System.out.println("<----------------------------------------------------------------------------------------->");
    }

    void warningMessage() {
        System.out.println("<----------------------------------------------------------------------------------------->");
        System.out.println("MINIMUM_BALANCE = 1000.0\n DAILY_WITHDRAW_LIMIT: 5000");
        System.out.println("<----------------------------------------------------------------------------------------->");
        readDeposit();

    }
    int readDeposit() {
        System.out.println("<----------------------------------------------------------------------------------------->");
        System.out.print("                                 Enter deposit:                             ");
        int sum = sc.nextInt();
        System.out.println("<----------------------------------------------------------------------------------------->");
        return sum;
    }
    public double getBalance() {
        return balance;
    }

    void showBalance() {
        System.out.println("<----------------------------------------------------------------------------------------->");
        System.out.print("                        Total your balance is:                       ");
        System.out.println(getBalance());
        System.out.println("<----------------------------------------------------------------------------------------->");
    }


    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAccHolderName() {
        return accHolderName;
    }

    public void setAccHolderName(String accHolderName) {
        this.accHolderName = accHolderName;
    }

    public int getAccHolderPhoneNo() {
        return accHolderPhoneNo;
    }

    public void setAccHolderPhoneNo(int accHolderPhoneNo) {
        this.accHolderPhoneNo = accHolderPhoneNo;
    }

    public double getWithdrawAmount() {
        return withdrawAmount;
    }

    public void setWithdrawAmount(double withdrawAmount) {
        this.withdrawAmount = withdrawAmount;
    }

    public boolean isAccountExists() {
        return accountExists;
    }

    public void setAccountExists(boolean accountExists) {
        this.accountExists = accountExists;
    }

    public String getAccHolderIFSCCode() {
        return accHolderIFSCCode;
    }

    public void setAccHolderIFSCCode(String accHolderIFSCCode) {
        this.accHolderIFSCCode = accHolderIFSCCode;
    }

    public Operation getOperation() {
        return operation;
    }

    public void setOperation(Operation operation) {
        this.operation = operation;
    }

    public double getDeposit() {
        return deposit;
    }

    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }

    public static double getMinimumBalance() {
        return MINIMUM_BALANCE;
    }

    public static double getDailyWithdrawLimit() {
        return DAILY_WITHDRAW_LIMIT;
    }


}