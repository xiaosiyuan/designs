package simplefactory;

public class OperationAdd extends AbstractOperation {
    @Override
    public Double getResult() {
        return getFirstNumber() + getSecondNumber();
    }
}
