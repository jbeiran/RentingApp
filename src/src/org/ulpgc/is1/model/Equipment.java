package src.org.ulpgc.is1.model;

public class Equipment extends Extra {
    private String name;

    public Equipment(int dayPrice, String name) {
        super(dayPrice);
        this.name = name;
    }

    public String getSurname() { return name; }
    public void setSurname(String surname) { this.name = surname; }

    @Override
    public String getName() {
        return this.name + " " +  this.getSurname();
    }
}
