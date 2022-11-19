public class HotDrink extends Bottle {
    private Integer temperature;

    public HotDrink (String name, Double cost, Double volume, Integer temperature) {
        super(name, cost, volume);
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return "HotDrink{" +
                "name='" + super.getName() +
                "', cost=" + super.getCost() +
                ", volume=" + super.getVolume() +
                ", temperature=" + temperature +
                "}";
    }

    public Integer getTemperature() {
        return temperature;
    }

    public void setTemperature(Integer temperature) {
        this.temperature = temperature;
    }
}
