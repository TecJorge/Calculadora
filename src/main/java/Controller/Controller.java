package Controller;


import Model.Funcionalidades;
import utils.utilitarios;

public class Controller {
    Funcionalidades funcionalidades;
    private double iPrimeiroNum,iSegundoNum;

    public Controller(){ funcionalidades=null;
    }
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
    public String Int2Bin(){return new Funcionalidades(iPrimeiroNum).convertInt2Bin();}
    public String Int2Hex(){return new Funcionalidades(iPrimeiroNum).convertInt2Hex();}

    public void initProgram(){
        System.out.println("\n\n");
        System.out.println("Calculadora");
        System.out.println("\n");
        System.out.println("1- Soma");
        System.out.println("2- Subtração");
        System.out.println("3- Multiplição");
        System.out.println("4- Divisão");
        System.out.println("5- Potência");
        System.out.println("6- Fatorial");
        System.out.println("7- Verificação de Primos");
        System.out.println("8- Verificar se um dado numero é a soma dos cubos(^3) do digitos que o compôem");
        System.out.println("9-Converter um numero inteiro decimal");
        System.out.println("10- Converter um numero binario para decimal");
        System.out.println("11- Converter um numero inteiro decimal para hexadecimal");
        System.out.println("0- Para Fechar a Aplicação");
    }

}
