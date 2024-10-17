package org.ulpgc.is1.model;

public abstract class Extra {
    private int dayPrice;
    public Extra(int dayPrice, String name) {
        this.dayPrice = dayPrice;
    }

    public abstract String getName();

    public int getDayPrice() {
        return dayPrice;
    }

    public void setDayPrice(int dayPrice) {
        this.dayPrice = dayPrice;
    }
}
