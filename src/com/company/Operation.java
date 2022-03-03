package com.company;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Operation {
    private String type;
    private double amount;
    private Date date;

    public Operation(String type, double amount) {
        this.setType(type);
        this.setAmount(amount);
        this.setDate(new Date());
    }

    public String dateOperation() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
        String name = type + " " + amount + " " + dateFormat.format(date);
        return name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Operation{" +
                "type='" + type + '\'' +
                ", amount=" + amount +
                '}';

    }
}
