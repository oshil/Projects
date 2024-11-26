
public class Dog extends Pet {

    private String breed;

    // Constructor to initialize the Dog attributes
    public Dog(String name, int age, String breed) {
        super(name, age, "Dog");
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    // Overriding the makeSound method
    @Override
    public String makeSound() {
        return "Bark";
    }

    // Overriding the eat method
    @Override
    public String eat() {
        return "Dog food";
    }
}
