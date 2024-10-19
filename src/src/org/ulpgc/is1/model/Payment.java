package src.org.ulpgc.is1.model;

import java.time.LocalDate;

public class Payment {

    private LocalDate date;
    private int price;

    public Payment(String date, int price) {
        this.date = LocalDate.parse(date);
        this.price = price;
    }

    public LocalDate getDate() {
        return date;
    }

    public int getPrice() {
        return price;
    }
}
