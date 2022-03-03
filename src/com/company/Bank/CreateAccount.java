package com.company.Bank;

import java.util.Scanner;

public class CreateAccount {
    Scanner scanner = new Scanner(System.in);
    String[] NameArray = {"Sultan"};
    String[] pinArray = {"nurislam2014"};
    int[] sumArray = {1234};

    public String[] getNameArray() {
        return NameArray;
    }

    public void setNameArray(String[] nameArray) {
        NameArray = nameArray;
    }

    public String[] getPinArray() {
        return pinArray;
    }

    public void setPinArray(String[] pinArray) {
        this.pinArray = pinArray;
    }

    public int[] getSumArray() {
        return sumArray;
    }

    public void setSumArray(int[] sumArray) {
        this.sumArray = sumArray;
    }

    void holderName() {
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
    }
}
