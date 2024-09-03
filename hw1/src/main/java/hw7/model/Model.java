package hw7.model;

public class Model {
    private ComplexNumber cn1;
    private ComplexNumber cn2;
    private ComplexOperations co;

    public Model(String firstComplexNumber, String secondComplexNumber) {
        this.cn1 = new ComplexNumber(firstComplexNumber);
        this.cn2 = new ComplexNumber(secondComplexNumber);
        this.co = new ComplexOperations();
    }

    public String getSum(){
        return co.getSum(cn1, cn2);
    }

    public String getDifference(){
        return co.getDifference(cn1, cn2);
    }

    public String getProduct(){
        return co.getProduct(cn1, cn2);
    }

    public String getQuotient(){
        return co.getQuotient(cn1, cn2);
    }

    @Override
    public String toString() {
        return "Model{" +
                "cn1=" + cn1 +
                ", cn2=" + cn2 +
                ", co=" + co +
                '}';
    }
}
