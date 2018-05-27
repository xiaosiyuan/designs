package proxy;

/**
 * 代理实现
 */
public class Proxy implements Subject{
    private RealSubject realSubject;

    public Proxy() {
        this.realSubject = new RealSubject();
    }

    @Override
    public void resquest() {
        realSubject.resquest();
    }
}
