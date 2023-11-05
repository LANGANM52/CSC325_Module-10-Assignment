// Concrete Casual Garment Factory
public class CasualGarmentFactory implements GarmentFactory {
    @Override
    public Garment createTops() {
        return new Tops();
    }

    @Override
    public Garment createPants() {
        return new Pants();
    }

    @Override
    public Garment createShoes() {
        return new Shoes();
    }
}
