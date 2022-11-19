import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>(Arrays.asList(
                new Product("Mars", 10.5),
                new Product("Twix", 20.5))
        );
        Machine machine = new Machine (products);
        Logger log = Logger.getLogger(Main.class.getName());
        log.info(machine.getProductByName("Mars").toString());

        List<Product> bottles = new ArrayList<>(Arrays.asList(
                new Bottle("Coca-Cola", 1.0, 0.5),
                new Bottle("Sprite", 20.0, 1.0))
        );
        Machine bottleMachine = new BottleMachine (bottles);
        log.info(bottleMachine.getProductByName("Coca-Cola").toString());

        List<Product> snacks = new ArrayList<>(Arrays.asList(
                new Snack("M&Ms", 10.0, "sweet"),
                new Snack("Lays", 12.0, "spicy"))
        );
        Machine snackMachine = new SnackMachine(snacks);
        log.info(snackMachine.getProductByName("Lays").toString());

        List<Product> hotDrinks = new ArrayList<>(Arrays.asList(
                new HotDrink("Cappuccino", 20.0, 0.3, 43),
                new HotDrink("Latte", 22.0, 0.3, 43),
                new HotDrink("Green tea", 15.0, 0.5,42),
                new HotDrink("Black tea", 16.0, 0.5,42))
        );
        HotDrinkMachine hotDrinkMachine = new HotDrinkMachine(hotDrinks);
        log.info(hotDrinkMachine.getProductByName("Latte").toString());
        log.info(hotDrinkMachine.getProduct("Black tea", 0.5, 42).toString());
    }
}
