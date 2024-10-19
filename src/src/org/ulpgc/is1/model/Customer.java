package src.org.ulpgc.is1.model;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name, surname;
    private CustomerType type;
    private final List<Renting> rentings = new ArrayList<>();


    public Customer(String name, String surname, CustomerType type) {
        this.name = name;
        this.surname = surname;
        this.type = type;
    }

    public String getName(){ return name;}

    public String getSurname(){ return surname; }

    public CustomerType getType(){ return this.type; }


    public void addRenting(Renting renting){
        if(rentings.contains(renting)){
            rentings.add(renting);
        }
    }
}
