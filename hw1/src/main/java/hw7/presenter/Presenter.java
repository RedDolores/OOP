package hw7.presenter;

import hw7.logger.Repository;
import hw7.model.Model;
import hw7.view.View;

public class Presenter {
    private Model model;
    private View view;
    private Repository repository;

    public Presenter(View view, Repository repository) {
        this.view = view;
        this.repository = repository;
    }

    public void run() {
        String firstComplexNumber = view.getFirstComplexNumber();
        String secondComplexNumber = view.getSecondComplexNumber();
        String operator = view.getOperation();
        model = new Model(firstComplexNumber, secondComplexNumber);
        saveInLog(firstComplexNumber);
        saveInLog(secondComplexNumber);
        if (operator.equals("+")) {
            String sum = model.getSum();
            saveInLog(sum);
            view.printResult(sum);
        }
        else if (operator.equals("-")) {
            String difference = model.getDifference();
            saveInLog(difference);
            view.printResult(difference);
        }
        else if (operator.equals("*")) {
            String product = model.getProduct();
            saveInLog(product);
            view.printResult(product);
        }
        else if (operator.equals("/")) {
            String quotient = model.getQuotient();
            saveInLog(quotient);
            view.printResult(quotient);
        }
    }

    private void saveInLog(String text){
        repository.saveLog(text);
    }
}

