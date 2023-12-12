package hw2;

public class Main {
    public static void main(String[] args) {
        Market market = new Market();
        Human h1 = new Human("H1");
        Human h2 = new Human("H2");
        market.acceptToMarket(h1);
        market.acceptToMarket(h2);
        market.update();
    }
}