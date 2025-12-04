public class Snake extends Animal implements Moveable{
    @Override
    void makeSound() {

        System.out.println("Hsss");
    }

    @Override
    void print() {

    }

    @Override
    public void move() {
        System.out.println("Snake is crawling");
    }
}
