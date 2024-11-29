package src.org.ulpgc.is1.model;

public class Equiment extends Extra {
    private String name;

    public Equiment(int dayPrice, String name) {
        super(dayPrice);
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
