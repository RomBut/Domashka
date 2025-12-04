public class Fish extends Animal implements Swimmable {
    public Fish(String name, int age) {
        super(name, age);
    }

    @Override
    void makeSound() {

        System.out.println("｡˚○");
    }

    @Override
    public void swim() {
        System.out.println("Fish is swimming!");
    }
}
