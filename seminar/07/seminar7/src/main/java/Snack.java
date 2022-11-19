public class Snack extends Product {
    private String taste;

    public Snack (String name, Double cost, String taste) {
        super(name, cost);
        this.taste = taste;
    }

    @Override
    public String toString() {
        return "Snack{" +
                "name='" + super.getName() +
                "', cost=" + super.getCost() +
                ", taste='" + taste +
                "'}";
    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }
}
