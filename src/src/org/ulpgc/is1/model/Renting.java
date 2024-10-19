package src.org.ulpgc.is1.model;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Renting {

    private static int nextId = 0;
    private final int id;
    private LocalDate date;
    private LocalDate from;
    private LocalDate to;
    private Payment payment;
    private Customer customer;
    private Room room;

    public Renting(Room room, String date, String from, String to, Customer customer, String paymentDate, Extra extra) {
        this.id = nextId++;
        this.date = LocalDate.parse(date);
        this.from = LocalDate.parse(from);
        this.to = LocalDate.parse(to);
        this.customer = customer;
        this.room = room;
        if(extra == null){
            this.payment = new Payment(paymentDate, price(room, this.from, this.to, 0));
        }else{
            this.payment = new Payment(paymentDate, price(room, this.from, this.to, extra.getDayPrice()));
        }

    }


    public int price(Room room, LocalDate from, LocalDate to, int extraDayPrice) {
        long days = ChronoUnit.DAYS.between(from, to);
        int basePrice = (int) (days * room.getDayPrice());
        int extrasPrice = extraDayPrice * (int) days;
        return basePrice + extrasPrice;
    }

    public int getId() {
        return id;
    }

    public LocalDate getDate() {
        return date;
    }

    public LocalDate getFrom() {
        return from;
    }

    public LocalDate getTo() {
        return to;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public void setTo(LocalDate to) {
        this.to = to;
    }

    public void setFrom(LocalDate from) {
        this.from = from;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
