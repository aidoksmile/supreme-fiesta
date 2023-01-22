public class Drinks extends Product{
    private int amount;
    public Drinks(int price, String name, int amount) {
        super(price, name);
        this.amount = amount;
    }
    @Override
    public String toString() {
        return super.toString() + " " + amount;
    }
    
}
