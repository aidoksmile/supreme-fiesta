public class Sauce extends Product {
    private boolean spicy;
    public Sauce(int price, String name, Boolean spicy) {
        super(price, name);
        this.spicy = spicy;
    }
    @Override
    public String toString() {
        return super.toString() + " " + spicy;
    }
    
}
