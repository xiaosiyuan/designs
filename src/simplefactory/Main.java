package simplefactory;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

        AbstractOperation operation = OperationFactory.createOperation("+");
        operation.setFirstNumber(10d);
        operation.setSecondNumber(20d);
        System.out.println(operation.getResult());

    }
}
