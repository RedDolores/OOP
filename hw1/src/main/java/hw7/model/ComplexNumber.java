package hw7.model;


public class ComplexNumber {
    private String complexNumber;
    private Integer firstPart;
    private Integer secondPart;
    private String thirdPart;

    public ComplexNumber(String complexNumber) {
        this.complexNumber = complexNumber;
        parsComplexNumber();
    }

    public Integer getFirstPart() {
        return firstPart;
    }

    public Integer getSecondPart() {
        return secondPart;
    }

    public String getThirdPart() {
        return thirdPart;
    }

    private void parsComplexNumber() {
        String[] parsComplexNumber = complexNumber.replace(" ", "").split("(?=\\D)");

        firstPart = Integer.parseInt(parsComplexNumber[0]);
        if (parsComplexNumber[1].equals("+")) {
            secondPart = 1;
        } else if (parsComplexNumber[1].equals("-")) {
            secondPart = -1;
        } else {
            secondPart = Integer.parseInt(parsComplexNumber[1]);
        }
        thirdPart = parsComplexNumber[2];

    }

    @Override
    public String toString() {
        return "ComplexNumber{" +
                "firstPart=" + firstPart +
                ", secondPart=" + secondPart +
                ", thirdPart='" + thirdPart + '\'' +
                '}';
    }
}
