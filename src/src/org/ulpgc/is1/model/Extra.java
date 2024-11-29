package src.org.ulpgc.is1.model;

public abstract class Extra {
    private final int dayPrice;

    protected Extra(int dayPrice) {
        this.dayPrice = dayPrice;
    }

    public abstract String getName();

    public int getDayPrice() {
        return dayPrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Extra extra = (Extra) o;
        return getName().equals(extra.getName());
    }
}
