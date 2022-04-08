public class Fatorial {
    private double numeroX,numeroY;
    private static final double numeroXDefault=0;
    private static final double numeroYDefault=0;
    public Fatorial (double x , double y){
        this.numeroX=x;
        this.numeroY=y;
    }
    public Fatorial(){
        this.numeroY=numeroYDefault;
        this.numeroX=numeroXDefault;
    }

    public void setNumeroX(double numeroX) {
        this.numeroX = numeroX;
    }

    public void setNumeroY(double numeroY) {
        this.numeroY = numeroY;
    }

    public double getNumeroX() {
        return numeroX;
    }

    public double getNumeroY() {
        return numeroY;
    }

    @Override
    public String toString() {
return String.format("O resultado do fatorial do numero :%.2f é %.2f",numeroX,numeroX);
    }
   double res=1;
    public double CalculoFatorial(double x){
        for (int i = 0; i <x ; i++) {
            res=res*(x-i);
        }
    return  0;}
}
