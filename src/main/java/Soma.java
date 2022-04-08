public class Soma {

    private double num1;
    private double num2;

    private static final double NUM1_OMISSAO = 0;
    private static final double NUM2_OMISSAO = 0;

    public Soma(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    public Soma() {
        num1 = NUM1_OMISSAO;
        num2 = NUM2_OMISSAO;
    }
    public double getNum1() {
        return num1;
    }
    public double getNum2() {
        return num2;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }
    public double somaDoisNumeros(){

    return (num1) + (num2);
    }
}

