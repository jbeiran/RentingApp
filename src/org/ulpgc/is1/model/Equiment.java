package org.ulpgc.is1.model;

public class Equiment extends Extra {
    private String surname;

    public Equiment(int dayPrice, String name, String surname) {
        super(dayPrice, name);
        this.surname = surname;
    }

    public String getSurname() { return surname; }
    public void setSurname(String surname) { this.surname = surname; }

    @Override
    public String getName() {
        return super.getName() + " " +  this.getSurname();
    }
}
