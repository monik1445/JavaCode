package Aug8.Polymorphism;

public class AnimalTest {
    public static void main(String[] args) {

        Animal animal = new Dog();
        animal.makeSound();

        Animal animal1 = new Cat();
        animal1.makeSound();
    }
}
