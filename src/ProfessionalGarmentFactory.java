// Concrete Professional Garment Factory
public class ProfessionalGarmentFactory implements GarmentFactory {
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
