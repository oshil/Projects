
public abstract class Pet {

    private String name;
    private int age;
    protected String species;

    // Constructor to initialize the attributes
    public Pet(String name, int age, String species) {
        this.name = name;
        this.age = age;
        this.species = species;
    }

    // Getter methods to access the private attributes
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSpecies() {
        return species;
    }

    // Abstract methods to be implemented by subclasses
    public abstract String makeSound();

    public abstract String eat();
}
