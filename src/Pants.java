// Concrete Product Pants
public class Pants implements Garment {
    @Override
    public void create(String variant) {
        System.out.println("Creating " + variant + " Pants");
    }
}
