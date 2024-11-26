
public class SpecialistVeterinarian implements Veterinarian {
    // Private attributes for the name and specialty
    private String name;
    private String specialty;

    // Constructor to initialize the name and specialty
    public SpecialistVeterinarian(String name, String specialty) {
        this.name = name;
        this.specialty = specialty;
    }

    // Implementing the getName method
    @Override
    public String getName() {
        return name;
    }

    // Implementing the examinePet method
    public String examinePet(Pet pet) {
        return String.format("%s examination of %s the %s", specialty, pet.getName(), pet.getSpecies());
    }
}
