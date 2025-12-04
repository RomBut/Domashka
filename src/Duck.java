public class Duck extends Animal implements Flyable, Moveable, Swimmable {

    public Duck(String name, int age) {
        super(name, age);

    }
    @Override
    void makeSound() {

        System.out.println("Krya!");
    }

    @Override
    public void fly() {
        System.out.println("Duck is flying!");
    }

    @Override
    public void swim() {
        System.out.println("Duck is swimming!");

    }
    @Override
    public void move() {
        System.out.println("Duck is walking!");
    }
}
