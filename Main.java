public class Main {
    public static void main(String[] args) {
        VendingMachine vending1 = new VendingMachine(new Product(10, "milk"));
        vending1.addProduct(new Product(20, "Bread"));
        vending1.addProduct(new Raviolli(30, "ot Palicha", 45));

        vending1.addProduct(new Drinks(100, "Pepsi", 1));
        vending1.addProduct(new Drinks(200, "Coca-Cola", 2));

        vending1.addProduct(new Sauce(70, "Ketchup", true));
        vending1.addProduct(new Sauce(59, "Mayonnaise", false));

        for (Product item : vending1.getProducts()) {
            System.out.println(item);
        }

        System.out.println("__________");

        Product find = vending1.find("Palicha");
        System.out.println(find);
    }
    
}