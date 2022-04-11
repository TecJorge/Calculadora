package Model;

public class Funcionalidades {
   private double dPrimeiroNum,dSegundoNum;
    public Funcionalidades(double dPrimeiroNum,double dSegundoNum){
        this.dPrimeiroNum=dPrimeiroNum;
        this.dSegundoNum=dSegundoNum;
    }
    public Funcionalidades(double dPrimeiroNum){
        this.dPrimeiroNum=dPrimeiroNum;
    }

    public double CalculoFatorial(){
        double res=1;
        for (int i = 1; i <dPrimeiroNum; i++) {
            res=res*(dPrimeiroNum-i);
        }
        return  res;}
    public double potencia(){
        return Math.pow(dPrimeiroNum,dSegundoNum);
    }
    public double Produto() {
        return dPrimeiroNum*dSegundoNum;
    }
    public double obterQuociente(){
        return dPrimeiroNum/dSegundoNum;
    }
    public double somaDoisNumeros(){return dPrimeiroNum+dSegundoNum;}
    public double subtracao(){
        return  dPrimeiroNum-dSegundoNum;
    }
    public boolean Primo() {
        for (int j = 2; j < dPrimeiroNum; j++) {
            if (dPrimeiroNum % j == 0)
                return false;
        }
        return true;
    }
    public String convertInt2Hex(){

        return Integer.toHexString((int) dPrimeiroNum);
    }
}
