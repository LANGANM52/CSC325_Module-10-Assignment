// Driver Class
public class GarmentSimulator {
    public static void main(String[] args) {
        // Create Professional Garments
        GarmentFactory professionalFactory = new ProfessionalGarmentFactory();
        Garment professionalTops = professionalFactory.createTops();
        Garment professionalPants = professionalFactory.createPants();
        Garment professionalShoes = professionalFactory.createShoes();

        professionalTops.create("Professional"); // Creating Professional Tops
        professionalPants.create("Professional"); // Creating Professional Pants
        professionalShoes.create("Professional"); // Creating Professional Shoes

        // Create Casual Garments
        GarmentFactory casualFactory = new CasualGarmentFactory();
        Garment casualTops = casualFactory.createTops();
        Garment casualPants = casualFactory.createPants();
        Garment casualShoes = casualFactory.createShoes();

        casualTops.create("Casual"); // Creating Casual Tops
        casualPants.create("Casual"); // Creating Casual Pants
        casualShoes.create("Casual"); // Creating Casual Shoes

        // Create Party Garments
        GarmentFactory partyFactory = new PartyGarmentFactory();
        Garment partyTops = partyFactory.createTops();
        Garment partyPants = partyFactory.createPants();
        Garment partyShoes = partyFactory.createShoes();

        partyTops.create("Party"); // Creating Party Tops
        partyPants.create("Party"); // Creating Party Pants
        partyShoes.create("Party"); // Creating Party Shoes
    }
}