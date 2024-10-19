package src.org.ulpgc.is1.model;

public abstract class Extra {
    private int dayPrice;


    public Extra(int dayPrice) {
        this.dayPrice = dayPrice;
    }

    public abstract String getName();

    public int getDayPrice() {
        return dayPrice;
    }
}
