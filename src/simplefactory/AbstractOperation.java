package simplefactory;

public abstract class AbstractOperation {

    private Double firstNumber;
    private Double secondNumber;

    public abstract Double getResult() throws Exception;

    public Double getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(Double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public Double getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(Double secondNumber) {
        this.secondNumber = secondNumber;
    }
}
