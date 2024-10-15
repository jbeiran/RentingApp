package org.ulpgc.is1.model;

public class Translator extends Extra {
    public String name;
    public String surname;

    public Translator(String name, String surname, int dayPrice) {
        super(dayPrice);
        this.name = name;
        this.surname = surname;
    }

    @Override
    public String getName() {
        return name + " " + surname;
    }
}
