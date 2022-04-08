public class Subtracao {

    private double x;
    private double y;



    private static final double X_POR_OMISSAO = 0.0;
    private static final double Y_POR_OMISSAO = 0.0;

    public Subtracao(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return String.format("O resultado da Diferença entre %.2f e %.2f é %.2f ",x,y,this.subtracao(x,y));
    }

    public double subtracao(double x , double y){
        return  x-y;
    }
}


