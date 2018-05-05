package decorate;

public class Decorate extends Person {

    protected Person component;

    public void decorate(Person person){
        this.component = person;
    }

    @Override
    public void show() {
        if(component != null){
            component.show();
        }
    }
}
