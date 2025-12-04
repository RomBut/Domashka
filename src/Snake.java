public class Snake extends Animal implements Moveable {
    public Snake(String name, int age) {
        super(name, age);
    }

    @Override
    void makeSound() {

        System.out.println("Hsss");
    }

    @Override
    public void move() {
        System.out.println("Snake is crawling");
    }
}
