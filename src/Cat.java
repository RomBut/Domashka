public class Cat extends Animal implements Moveable {
    @Override
    void makeSound() {
        System.out.println("Myau!!");
    }

    @Override
    void print() {

    }

    @Override
    public void move() {
        System.out.println("Cat is walking!");
    }


}
