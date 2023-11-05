// Concrete Party Garment Factory
public class PartyGarmentFactory implements GarmentFactory {
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
