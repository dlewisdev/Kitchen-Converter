public class Cup {
    private int quantity;

    public Cup(int quantity) {
        this.quantity = quantity;
    }

    public double toTbs() {
        return (this.quantity * 1.0) * 16;
    }

    public double toTsp() {
        return (this.quantity * 1.0) * 48;
    }

}
