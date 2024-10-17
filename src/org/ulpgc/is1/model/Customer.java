package org.ulpgc.is1.model;

public class Customer {
    public String name, surname;
    public CustomerType type;


    public Customer(String name, String surname, CustomerType type) {
        this.name = name;
        this.surname = surname;
        this.type = type;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getSurname() { return surname; }
    public void setSurname(String surname) { this.surname = surname; }

    public CustomerType getType() { return type; }
    public void setType(CustomerType type) { this.type = type; }
}
