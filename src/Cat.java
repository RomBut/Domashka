public class Cat extends Animal implements Moveable {

    public Cat(String name, int age) {
        super(name,age);

    }
    @Override
    void makeSound() {
        System.out.println("Myau!!");
    }

    @Override
    public void move() {
        System.out.println("Cat is walking!");
    }


}
