public class Dog extends Animal implements Moveable, Swimmable {

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    void makeSound() {
        System.out.println("Gav!");
    }

    @Override
    void print() {
        makeSound();
        swim();
        move();
        eat();
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
