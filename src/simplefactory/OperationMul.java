package simplefactory;

public class OperationMul extends AbstractOperation {
    @Override
    public Double getResult() {
        return getFirstNumber() * getSecondNumber();
    }
}
