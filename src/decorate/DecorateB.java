package decorate;

public class DecorateB extends Decorate {

    @Override
    public void show() {
        System.out.println("装饰B");
        super.show();
    }
}
