package animal;
import edible.Edible;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Quac Quac!";
    }

    @Override
    public String howToEat() {
        return "Butcher a chicken and cooked";
    }
}
