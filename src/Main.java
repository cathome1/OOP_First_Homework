import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<HotDrink> products = new ArrayList<>();
        ArrayList<HotDrinkVendingMachine> machines = new ArrayList<>();
        products.add(new HotDrink("чай", 25, 80, 0.2));
        products.add(new HotDrink("кофе", 50, 80, 0.2));
        products.add(new HotDrink("холодный чай", 30, 5, 0.5));
        machines.add(new HotDrinkVendingMachine("Nestea"));
        machines.add(new HotDrinkVendingMachine("Nescafe"));
        for(HotDrinkVendingMachine vend : machines){
            for (HotDrink prod : products){
                vend.getProduct(prod.getName(),prod.getVolume(),prod.getTemp());
            }
        }
    }
}