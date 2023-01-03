public class HotDrinkVendingMachine extends VendingMachine{
    private String name;
    public HotDrinkVendingMachine(String name) {
        System.out.println(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void getProduct(String name, double volume, double temperature) {
        System.out.printf("Аппарат %s выдал напиток %s, объёмом %.2f и температурой %.1f\n", this.getName(), name, volume, temperature);
    }
}
