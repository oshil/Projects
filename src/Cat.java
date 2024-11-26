
public class Cat extends Pet {

    private String color;

    // Constructor to initialize the Cat attributes
    public Cat(String name, int age, String color) {
        super(name, age, "Cat");
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    // Overriding the makeSound method
    @Override
    public String makeSound() {
        return "Meow";
    }

    // Overriding the eat method
    @Override
    public String eat() {
        return "Cat food";
    }
}
