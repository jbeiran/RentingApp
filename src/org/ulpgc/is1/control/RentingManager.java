package src.org.ulpgc.is1.control;

import src.org.ulpgc.is1.model.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RentingManager {
    private final List<Customer> customers = new ArrayList<>();
    private final List<Room> rooms = new ArrayList<>();
    private final List<Translator> translators = new ArrayList<>();
    private final List<Equiment> equiments = new ArrayList<>();
    private final List<> rents = new ArrayList<>();

    public Boolean addCustomer(String name, String surname) {
        Customer customer = new Customer(name, surname);
        if (customers.contains(customer)) {
            return false;
        } else {
            customers.add(customer);
            return true;
        }
    }

    public Customer getCustomer(int index) {
        return customers.get(index);
    }

    public Boolean addRoom(String name, int capacity, int dayPrice, RoomType type) {
        Room room = new Room(name, capacity, dayPrice, type);
        if (rooms.contains(room)) {
            return false;
        } else {
            rooms.add(room);
            return true;
        }
    }

    public Room getRoom(int index) {
        return rooms.get(index);
    }

    public Boolean addTranslator(int dayPrice, String name, String surname) {
        Translator translator = new Translator(dayPrice, name, surname);
        if (translators.contains(translator)) {
            return false;
        } else {
            translators.add(translator);
            return true;
        }
    }

    public Translator getTranslator(int index) {
        return translators.get(index);
    }

    public Boolean addEquiment(int dayPrice, String name) {
        Equiment equiment = new Equiment(dayPrice, name);
        if (equiments.contains(equiment)) {
            return false;
        } else {
            equiments.add(equiment);
            return true;
        }
    }

    public Equiment getEquiment(int index) {
        return equiments.get(index);
    }

    public void rent(Room room, Renting renting, Customer customer, Extra extra) {
        Object[] rent = new Object[]{room, renting, customer, extra};
        rents.add(rent);
    }

    public List getRentingList() {
        return rents;
    }
}