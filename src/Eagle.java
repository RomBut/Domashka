public class Eagle extends Animal implements Flyable {
    @Override
    void makeSound() {

        System.out.println("Yahoo!");
    }

    @Override
    void print() {

    }

    @Override
    public void fly() {
        System.out.println("Eagle is flying!");
    }
}
