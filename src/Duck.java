public class Duck extends Animal implements Flyable,Runnable,Swimmable{
    @Override
    void makeSound() {

        System.out.println("Krya!");
    }

    @Override
    void print() {

    }

    @Override
    public void fly() {
        System.out.println("Duck is flying!");
    }

    @Override
    public void swim() {
        System.out.println("Duck is swimming!");;
    }

    @Override
    public void run() {
        System.out.println("Duck is walking!");
    }
}
