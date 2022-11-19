import java.util.List;

public class Machine {
    private final List<Product> products;

    public Machine (List<Product> products) {
        this.products = products;
    }

    public Product getProductByName (String name) {
        for (Product product : products) {
            if (product.getName().equals(name)) {
                return product;
            }
        }
        throw new IllegalStateException("Product not found");
    }

    public List<Product> getProducts() {
        return this.products;
    }
}
