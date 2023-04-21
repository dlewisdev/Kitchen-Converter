public class Tablespoon {
    private int quantity;

    public Tablespoon(int quantity) {
        this.quantity = quantity;
    }

    public double toTsp() {
        return (this.quantity * 1.0) * 3;
    }

    public double toCup() {
        return (this.quantity * 1.0) * 0.0625;
    }

}
