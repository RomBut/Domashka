public class Dog extends Animal implements Moveable, Swimmable {
       public Dog(String name, int age) {
        super(name,age);
    }

    @Override
    void makeSound() {
        System.out.println("Gav!");
    }

    @Override
    public void move() {
        System.out.println("Dog is running!");
    }

    @Override
    public void swim() {
        System.out.println("Dog is swimming!");
    }
}
