package UI;
import Controller.Controller;
import utils.utilitarios;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Controller controller;
        String Opcao;
        double iPrimeiroNum,iSegundoNum,iResultado;
        boolean bGuardar;
            do {
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
                Opcao = utilitarios.readLineFromConsole("Introduza a opção\n");
                try {
                    switch (Opcao) {
                        case "1":
                            iPrimeiroNum= Double.parseDouble(utilitarios.readLineFromConsole("insira o Primeiro Número"));
                            iSegundoNum= Double.parseDouble(utilitarios.readLineFromConsole("insira o Segundo Número"));
                            controller=new Controller(iPrimeiroNum,iSegundoNum);
                            System.out.printf("A soma entre os dois inseridos é %.2f",controller.Soma());
                            bGuardar=utilitarios.confirma("Deseja Guardar o Resultado?\n [S/N]");
                            if (bGuardar)
                                iResultado=controller.Soma();
                            break;
                        case "2":
                            iPrimeiroNum= Double.parseDouble(utilitarios.readLineFromConsole("insira o Primeiro Número"));
                            iSegundoNum= Double.parseDouble(utilitarios.readLineFromConsole("insira o Segundo Número"));
                            controller=new Controller(iPrimeiroNum,iSegundoNum);
                            System.out.printf("A subtração entre os dois inseridos é %.2f",controller.Substracao());
                            bGuardar=utilitarios.confirma("Deseja Guardar o Resultado?\n [S/N]");
                            if (bGuardar)
                                iResultado=controller.Substracao();
                            break;
                        case "3":
                            iPrimeiroNum= Double.parseDouble(utilitarios.readLineFromConsole("insira o Primeiro Número"));
                            iSegundoNum= Double.parseDouble(utilitarios.readLineFromConsole("insira o Segundo Número"));
                            controller=new Controller(iPrimeiroNum,iSegundoNum);
                            System.out.printf("A multiplicação entre os dois inseridos é %.2f",controller.Multiplica());
                            bGuardar=utilitarios.confirma("Deseja Guardar o Resultado?\n [S/N]");
                            if (bGuardar)
                                iResultado=controller.Multiplica();
                            break;
                        case "4":
                            iPrimeiroNum= Double.parseDouble(utilitarios.readLineFromConsole("insira o Primeiro Número"));
                            iSegundoNum= Double.parseDouble(utilitarios.readLineFromConsole("insira o Segundo Número"));
                            controller=new Controller(iPrimeiroNum,iSegundoNum);
                            System.out.printf("A divisão entre os dois inseridos é %.2f",controller.Divisao());
                            bGuardar=utilitarios.confirma("Deseja Guardar o Resultado?\n [S/N]");
                            if (bGuardar)
                                iResultado= controller.Divisao();
                            break;
                        case "5":
                            iPrimeiroNum= Double.parseDouble(utilitarios.readLineFromConsole("insira o Primeiro Número"));
                            iSegundoNum= Double.parseDouble(utilitarios.readLineFromConsole("insira o Segundo Número"));
                            controller=new Controller(iPrimeiroNum,iSegundoNum);
                            System.out.printf("A potência entre os dois inseridos é %.2f",controller.Potencia());
                            bGuardar=utilitarios.confirma("Deseja Guardar o Resultado?\n [S/N]");
                            if (bGuardar)
                                iResultado=controller.Potencia();
                            break;
                        case "6":
                            iPrimeiroNum= Double.parseDouble(utilitarios.readLineFromConsole("insira o Primeiro Número"));
                            iSegundoNum= Double.parseDouble(utilitarios.readLineFromConsole("insira o Segundo Número"));
                            controller=new Controller(iPrimeiroNum,iSegundoNum);
                            System.out.printf("O factorial entre os dois inseridos é %.2f",controller.Fatorial());
                            bGuardar=utilitarios.confirma("Deseja Guardar o Resultado?\n [S/N]");
                            if (bGuardar)
                                iResultado=controller.Fatorial();
                            break;
                        case "7":
                            iPrimeiroNum= Double.parseDouble(utilitarios.readLineFromConsole("insira o Número"));
                            controller=new Controller(iPrimeiroNum);
                            if (){
                            System.out.printf("O Número inserido é um Número Primo",controller.Primo());

                            bGuardar=utilitarios.confirma("Deseja Guardar o Resultado?\n [S/N]");
                            if (bGuardar)
                                iResultado=controller.Primo();
                            break;
                        case "8":
                        case "9":
                        case "10":
                        case "11":
                            throw new IllegalArgumentException("Função ainda não foi implementada");

                    }
                }catch (Exception e){
                    System.out.println(e.getMessage());
                }
            } while (!Opcao.equalsIgnoreCase("0"));

        }

    }


//1-Obter a soma de dois numeros  XL  1
//2-Obter o produto de dois numeros  XL  1
//3-Obter a subtraccao de dois numeros XL 1
//4-Obter o quociente de dois numeros  XL 1
//5-Memorizar um resultado de uma operacao
//6-Reaprovitar o valor memorizado no ambito de uma operacao
//7-Apagar o valor memorizado
//8-Calcular o valor de x^8  1
//9-Calcular o fatorial de um numero  1
//10-Verificar se um dado numero é primo
//11-Verificar se um dado numero é a soma dos cubos(^3) do digitos que o compôem
//12-Converter um numero inteiro decimal
//13-Converter um numero binario para decimal
//14-Converter um numero inteiro decimal para hexadecimal