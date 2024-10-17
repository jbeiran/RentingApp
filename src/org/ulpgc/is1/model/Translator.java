package org.ulpgc.is1.model;

public class Translator extends Extra {
    private String name;
    private String surname;

    public Translator(String name, String surname, int dayPrice) {
        super(dayPrice);
        this.name = name;
        this.surname = surname;
    }


    @Override
    public String getName() { return name ; }
    public void setName(String name) { this.name = name; }

    public String getSurname() { return surname; }
    public void setSurname(String surname) { this.surname = surname; }
}
