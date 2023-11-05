// Concrete Product Shoes
public class Shoes implements Garment {
    @Override
    public void create(String variant) {
        System.out.println("Creating " + variant + " Shoes");
    }
}
