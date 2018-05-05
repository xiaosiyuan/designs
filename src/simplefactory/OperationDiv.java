package simplefactory;

public class OperationDiv extends AbstractOperation {
    @Override
    public Double getResult() throws Exception {
        if(getSecondNumber() == 0){
            throw new Exception("除数不能为0");
        }
        return getFirstNumber() / getSecondNumber();
    }
}
