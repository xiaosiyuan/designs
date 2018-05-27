package proxy;

/**
 * 真实实现
 */
public class RealSubject implements Subject{
    @Override
    public void resquest() {
        System.out.println("真实的实现");
    }
}
