public class Teaspoon {
    private int quantity;

    public Teaspoon(int quantity) {
        this.quantity = quantity;
    }

    public double toTbs() {
        return (this.quantity * 1.0) * (1/3);
    }

    public double toCups() {
        return (this.quantity * 1.0) * 0.0208333;
    }
}
