package hw7.view;

import java.util.Scanner;

public class DataValidator {

    private Scanner in;
    private String validData;
    private String validOperator;

    private Boolean validationData(String st) {
        String[] parsString = st.replace(" ", "").split("(?=\\D)");
        if (parsString.length == 3) return true;
        else return false;
    }

    private boolean validationOperator(String st) {
        if (st.equals("+") || st.equals("-") || st.equals("*") || st.equals("/")) return true;
        else return false;
    }

    public String getValidData() {
        setValidData();
        return validData;
    }

    public String getValidOperator() {
        setValidOperator();
        return validOperator;
    }

    private void setValidData() {
        this.in = new Scanner(System.in);
        String inSt = in.nextLine();
        if (!validationData(inSt)) {
            System.out.println("Invalid enter, try again.");
            setValidData();
        } else {
            validData = inSt;
        }

    }

    private void setValidOperator() {
        this.in = new Scanner(System.in);
        String inSt = in.nextLine();
        if (!validationOperator(inSt)) {
            System.out.println("Invalid enter, try again.");
            setValidOperator();
        } else {
            validOperator = inSt;
        }
    }
}
