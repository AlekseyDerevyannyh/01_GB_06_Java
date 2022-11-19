import java.util.List;

public class HotDrinkMachine extends Machine {

    public HotDrinkMachine (List<Product> products) {
        super(products);
    }

    public Product getProduct (String name, Double volume, Integer temperature) {
        List<Product> products = getProducts();
        for (Product product : products) {
            if (product instanceof HotDrink) {
                HotDrink hotDrink = (HotDrink) product;
                if (hotDrink.getName().equals(name) && hotDrink.getVolume().equals(volume) && hotDrink.getTemperature().equals(temperature)) {
                    return hotDrink;
                }
            }
        }
        throw new IllegalStateException("Hot drink not found");
    }
}
