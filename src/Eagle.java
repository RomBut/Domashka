public class Eagle extends Animal implements Flyable, Moveable {
    public Eagle(String name, int age) {
        super(name,age);
    }
    @Override
    void makeSound() {

        System.out.println("Yahoo!");
    }
    @Override
    public void fly() {
        System.out.println("Eagle is flying!");
    }

    @Override
    public void move() {

    }
}
