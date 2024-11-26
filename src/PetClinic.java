import java.util.ArrayList;
import java.util.List;

public class PetClinic {
    public static void main(String[] args) {
        // Create instances of pets
        Pet dog = new Dog("Doggy", 5, "Spaniel");
        Pet cat = new Cat("Kitty", 1, "White");

        // Create instances of veterinarians
        Veterinarian generalVet = new GeneralVeterinarian("Dr.Cohen");
        Veterinarian specialistVet = new SpecialistVeterinarian("Dr.Levi", "Surgeon");

        examinationProcess(dog, cat, generalVet, specialistVet);
    }

    private static void examinationProcess(Pet dog, Pet cat, Veterinarian generalVet, Veterinarian specialistVet) {
        List<Pet> pets = new ArrayList<>();
        pets.add(dog);
        pets.add(cat);

        // Demonstrate the examination process
        for (Pet pet : pets) {
            System.out.println(
                    String.format("%s the %s make sound %s", pet.getName(), pet.getSpecies(), pet.makeSound()));
            System.out.println(String.format("%s examines: %s", generalVet.getName(), generalVet.examinePet(pet)));
            System.out
                    .println(String.format("%s examines: %s", specialistVet.getName(), specialistVet.examinePet(pet)));
            System.out.println("-----------------------");
        }
    }
}
