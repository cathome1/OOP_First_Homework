public class HotDrink extends Product{
    private int temp;

    public HotDrink(String name, double cost, int temp, double volume) {
        super(name, cost);
        this.temp = temp;
        this.setVolume(volume);
    }

    public int getTemp() {
        return temp;
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }
}
