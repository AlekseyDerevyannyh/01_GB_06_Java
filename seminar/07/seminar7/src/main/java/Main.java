import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<Product>(Arrays.asList(
                new Product("Mars", 10.5),
                new Product("Twix", 20.5))
        );

        Machine machine = new Machine (products);

        System.out.println(machine.getProductByName("Mars"));

        List<Product> bottles = new ArrayList<Product>(Arrays.asList(
                new Bottle("Coca-Cola", 1.0, 0.5),
                new Bottle("Sprite", 20.0, 1.0))
        );

        Machine bottleMachine = new BottleMachine (bottles);

        System.out.println(bottleMachine.getProductByName("Coca-Cola"));
    }
}
