package src.org.ulpgc.is1.model;
import java.util.ArrayList;
import java.util.List;

public class Room {
    private String name;
    private int capacity;
    private int dayPrice;
    private RoomType type;
    private final List<Renting> rentings = new ArrayList<>();


    public Room(String name, int capacity, int dayPrice, RoomType type) {
        this.name = name;
        this.capacity = capacity;
        this.dayPrice = dayPrice;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getDayPrice() {
        return dayPrice;
    }

    public RoomType getType() {
        return type;
    }

    public void addRent(Renting renting) {
        rentings.add(renting);
    }

    public List<Renting> getRentings() {
        return new ArrayList<>(rentings);
    }
}
