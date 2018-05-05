package simplefactory;

public class OperationSub extends AbstractOperation {
    @Override
    public Double getResult() {
        return getFirstNumber() - getSecondNumber();
    }
}
