package org.ulpgc.is1.model;

public abstract class Extra {
    public int dayPrice;

    public Extra(int dayPrice) {
        this.dayPrice = dayPrice;
    }

    public abstract String getName();
}
