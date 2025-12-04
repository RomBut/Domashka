public abstract class Animal {
    String name;
    int age;

    abstract void makeSound();
    abstract void print();

    void eat() {
        System.out.println("Animal is eating");
    }
}
