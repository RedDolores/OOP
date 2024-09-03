package hw7.view;

public class ConsoleView implements View {

    private DataValidator validator;

    public ConsoleView() {
        validator = new DataValidator();
    }

    @Override
    public String getFirstComplexNumber() {
        System.out.println("Enter value of first complex number: ");
        return validator.getValidData();
    }

    @Override
    public String getSecondComplexNumber() {
        System.out.println("Enter value of second complex number: ");
        return validator.getValidData();
    }

    @Override
    public String getOperation() {
        System.out.println("Enter symbol of operation: ");
        return validator.getValidOperator();
    }

    @Override
    public void printResult(String st) {
        System.out.printf("Result: %s", st);
        System.out.println();
    }
}
