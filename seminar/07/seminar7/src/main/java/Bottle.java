public class Bottle extends Product {
    private Double volume;

    public Bottle (String name, Double cost, Double volume) {
        super(name, cost);
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Bottle{" +
                "name='" + super.getName() +
                "', cost=" + super.getCost() +
                ", volume=" + this.volume +
                "}";
    }

    public Double getVolume() {
        return volume;
    }

    public void setVolume(Double volume) {
        this.volume = volume;
    }
}
