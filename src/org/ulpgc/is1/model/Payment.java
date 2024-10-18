package org.ulpgc.is1.model;

import java.time.LocalDate;

public class Payment {
    private int price;
    private LocalDate date;

    public Payment(int price, Date date) {
        this.price = price;
        this.date = date;
    }

    public int getPrice() {
        return price;
    }

    public Date getDate() {
        return date;
    }

}
