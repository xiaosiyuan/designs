package strategy;

public class Context {

    private Stagtegy stagtegy;

    public Context(String algorithm) {
        switch (algorithm){
            case "A":stagtegy = new ConcreteStagtegyA();break;
            case "B":stagtegy = new ConcreteStagtegyB();break;
            default:break;
        }
    }

    public void contextInterface(){
        stagtegy.algorithmInterface();
    }
}
