package decorate;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Person person = new Person("David");
        Decorate decorateA = new DecorateA();
        Decorate decorateB = new DecorateB();
        decorateA.decorate(person);
        decorateB.decorate(decorateA);
        decorateB.show();
    }
}
