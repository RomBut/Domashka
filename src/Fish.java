public class Fish extends Animal implements Swimmable{
    @Override
    void makeSound() {

        System.out.println("｡˚○");
    }

    @Override
    void print() {

    }

    @Override
    public void swim() {
        System.out.println("Fish is swimming!");
    }
}
