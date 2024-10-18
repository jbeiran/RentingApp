package org.ulpgc.is1.model;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

public class Renting {
    private static int NEXT_ID = 0;
    private final int id;
    private LocalDate date;
    private LocalDate from;
    private LocalDate to;

    private Payment payment;
    private Customer customer;
    private List<Extra> extras;
    private Room room;

    public Renting(LocalDate date, LocalDate from, LocalDate to, Room room, Customer customer) {
        this.id = NEXT_ID++;
        this.date = date;
        this.from = from;
        this.to = to;
        this.room = room;
        this.payment = payment;
        this.customer = customer;
        this.extras = new ArrayList<>();
    }

    public void addExtra(Extra extra) {
        extras.add(extra)
    }

    public int price() {
        long days = ChronoUnit.DAYS.between(from, to);
        int basePrice = (int) (days * room.getDayPrice());
        int extrasPrice = extras.stream().mapToInt(Extra::getDayPrice).sum() * (int) days;
        return basePrice + extrasPrice;
    }

    public int getId() {
        return id;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalDate getFrom() {
        return from;
    }

    public void setFrom(LocalDate from) {
        this.from = from;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public LocalDate getTo() {
        return to;
    }

    public void setTo(LocalDate to) {
        this.to = to;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<Extra> getExtras() {
        return extras;
    }

    public void setExtras(List<Extra> extras) {
        this.extras = extras;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }
}
