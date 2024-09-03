package hw7.model;

public class ComplexOperations {

    private String getString(int number1, int number2, ComplexNumber z) {
        String st = "";
        if (number2 == 0) {
            st += number1;
        } else if (number2 == 1) {
            st += number1 + "+" + z.getThirdPart();
        } else if (number2 == -1) {
            st += number1 + "-" + z.getThirdPart();
        } else {
            if (number2 < 0) {
                st += number1 + "" + number2 + z.getThirdPart();
            } else {
                st += number1 + "+" + number2 + z.getThirdPart();
            }
        }
        return st;
    }

    public String getSum(ComplexNumber z1, ComplexNumber z2) {
        int sumOne = z1.getFirstPart() + z2.getFirstPart();
        int sumTwo = z1.getSecondPart() + z2.getSecondPart();
        String st = getString(sumOne, sumTwo, z1);
        return st;
    }

    public String getDifference(ComplexNumber z1, ComplexNumber z2) {
        int differenceOne = z1.getFirstPart() - z2.getFirstPart();
        int differenceTwo = z1.getSecondPart() - z2.getSecondPart();
        String st = getString(differenceOne, differenceTwo, z1);
        return st;
    }

    public String getProduct(ComplexNumber z1, ComplexNumber z2) {
        int productOne = z1.getFirstPart() * z2.getFirstPart() + (z1.getSecondPart() * z2.getSecondPart() * -1);
        int productTwo = z1.getFirstPart() * z2.getSecondPart() + z1.getSecondPart() * z2.getFirstPart();
        String st = getString(productOne, productTwo, z1);
        return st;
    }

    public String getQuotient(ComplexNumber z1, ComplexNumber z2) {
        String quotient = "";
        String additionalComplexNumber = getString(z2.getFirstPart(), z2.getSecondPart() * -1, z2);
        ComplexNumber z3 = new ComplexNumber(additionalComplexNumber);
        quotient += getProduct(z1, z3) + "/" + getProduct(z2, z3);
        return quotient;
    }
}
