package decorate;

public class DecorateA extends Decorate {

    @Override
    public void show() {
        System.out.println("装饰A");
        super.show();
    }
}
