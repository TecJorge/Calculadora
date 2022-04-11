package Controller;


import Model.Funcionalidades;
import utils.utilitarios;

public class Controller {
    Funcionalidades funcionalidades;
    private double iPrimeiroNum,iSegundoNum;


    public Controller(double iPrimeiroNum,double iSegundoNum){
        this.iPrimeiroNum=iPrimeiroNum;
        this.iSegundoNum=iSegundoNum;
    }
    public Controller(double iPrimeiroNum){
        this.iPrimeiroNum=iPrimeiroNum;
    }
    public double Soma(){
        return new Funcionalidades(iPrimeiroNum,iSegundoNum).somaDoisNumeros();
    }
    public double Substracao(){return new Funcionalidades(iPrimeiroNum,iSegundoNum).subtracao();}

    public double Multiplica(){return new Funcionalidades(iPrimeiroNum,iSegundoNum).Produto();}
    public double Divisao(){return new Funcionalidades(iPrimeiroNum,iSegundoNum).obterQuociente();}
    public double Potencia(){return new Funcionalidades(iPrimeiroNum,iSegundoNum).Produto();}
    public double Fatorial(){return new Funcionalidades(iPrimeiroNum,iSegundoNum).CalculoFatorial();}
    public boolean Primo(){return new Funcionalidades(iPrimeiroNum).Primo();}
    public boolean guardar(){
        return utilitarios.confirma("Deseja Guardar o Resultado?\n [S/N]");
    }

}
