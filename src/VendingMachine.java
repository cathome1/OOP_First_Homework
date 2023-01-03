import java.util.List;

public abstract class VendingMachine {
    public void initProduct(List<Product> productList){

    }
    public void getProduct(String name, double volume, double temperature){
        System.out.println(name);
    }
    public void restore(){
        System.out.println("Продукт потреблён");
    }
}
