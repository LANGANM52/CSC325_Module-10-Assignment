// Concrete Product Tops
public class Tops implements Garment {
    @Override
    public void create(String variant) {
        System.out.println("Creating " + variant + " Tops");
    }
}
