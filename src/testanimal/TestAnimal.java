package testanimal;

import animal.Animal;
import animal.Chicken;
import animal.Tiger;

public class TestAnimal {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for(Animal animal : animals){
            if(animal instanceof Chicken){
                Chicken chicken = (Chicken) animal;
                System.out.println(chicken.howToEat());
            }
            System.out.println(animal.makeSound());
        }
    }
}
