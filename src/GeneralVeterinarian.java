
public class GeneralVeterinarian implements Veterinarian {

    private String name;

    // Constructor to initialize the name
    public GeneralVeterinarian(String name) {
        this.name = name;
    }

    // Implementing the getName method
    @Override
    public String getName() {
        return name;
    }

    // Implementing the examinePet method
    @Override
    public String examinePet(Pet pet) {
        return String.format("General examination of %s the %s", pet.getName(), pet.getSpecies());
    }
}
