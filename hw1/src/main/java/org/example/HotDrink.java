package org.example;

public class HotDrink extends Product{
    private int volume;
    private int temperature;
    public HotDrink(String name, double cost, int volume, int temperature) {
        super(name, cost);
        this.volume = volume;
        this.temperature = temperature;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return "HotDrink{" +
                "name='" + super.getName() + '\'' +
                ", cost=" + super.getCost()  +
                ", volume=" + volume +
                ", temperature=" + temperature +
                '}';
    }
}
