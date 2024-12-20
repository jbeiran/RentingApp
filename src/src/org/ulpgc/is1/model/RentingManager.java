package src.org.ulpgc.is1.model;

import java.util.ArrayList;
import java.util.List;

public class RentingManager {

    private final List<Customer> customers = new ArrayList<>();
    private final List<Room> rooms = new ArrayList<>();
    private final List<Translator> translators = new ArrayList<>();
    private final List<Equiment> equiments = new ArrayList<>();

    public void addCustomer(String name, String surname, CustomerType type) {
        Customer customer = new Customer(name, surname, type);
        if (this.customers.contains(customer)) {
            System.out.print("This Customer was already included in the system " + "\n");
        } else {
            this.customers.add(customer);
            System.out.print("This Customer has been added " + "\n");
        }
    }

    public Customer getCustomer(int index) {
        return this.customers.get(index);
    }

    public void addRoom(String name, int capacity, int dayPrice, RoomType type) {
        Room room = new Room(name, capacity, dayPrice, type);
        if (this.rooms.contains(room)) {
            System.out.print("This room was already included in the system " + "\n");
        } else {
            this.rooms.add(room);
            System.out.print("This room has been added " + "\n");
        }
    }

    public Room getRoom(int index) {
        return this.rooms.get(index);
    }

    public void addTranslator(int dayPrice, String name, String surname) {
        Translator translator = new Translator(dayPrice, name, surname);
        if (this.translators.contains(translator)) {
            System.out.print("This translator was already included in the system " + "\n");
        } else {
            this.translators.add(translator);
            System.out.print("The translator has been added " + "\n");
        }
    }

    public Translator getTranslator(int index) {
        return this.translators.get(index);
    }

    public void addEquiment(int dayPrice, String name) {
        Equiment equiment = new Equiment(dayPrice, name);
        if (this.equiments.contains(equiment)) {
            System.out.print("This equiment was already included in the system " + "\n");
        } else {
            this.equiments.add(equiment);
            System.out.print("This equiment has been added " + "\n");
        }
    }

    public Equiment getEquiment(int index) {
        return this.equiments.get(index);
    }

    public void rent(Room room, Customer customer, Extra extra, String date, String from, String to, String paymentDay) {
        if (!rooms.contains(room)) {
            throw new IllegalArgumentException("Room not registered in system");
        }
        if (!customers.contains(customer)) {
            throw new IllegalArgumentException("Customer not registered in system");
        }
        if (extra != null && !equiments.contains(extra) && !translators.contains(extra)) {
            throw new IllegalArgumentException("Extra not registered in system");
        }
        
        Renting rent = new Renting(room, date, from, to, customer, paymentDay, extra);
        room.addRent(rent);
        customer.addRenting(rent);
    }
}
