package UI;

import Controller.Controller;
import utils.utilitarios;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Controller controller=new Controller();
        String Opcao;
        double iPrimeiroNum, iSegundoNum, iResultado=0;
        boolean bGuardar;

        do {
            controller.initProgram();
            Opcao = utilitarios.readLineFromConsole("Introduza a opção\n");
            try {
                switch (Opcao) {
                    case "1":
                        if (iResultado!=0){
                            bGuardar = utilitarios.confirma("Deseja Usar o Resultado Previamente Guardado?\n [S/N]");
                            if (bGuardar){
                                iSegundoNum = Double.parseDouble(utilitarios.readLineFromConsole("insira o Segundo Número"));
                                controller=new Controller(iResultado,iSegundoNum);
                                System.out.printf("A soma entre os dois inseridos é %.2f", controller.Soma());
                                bGuardar = utilitarios.confirma("Deseja Guardar o Resultado?\n [S/N]");
                                if (bGuardar)
                                    iResultado = controller.Soma();
                            }
                        }
                        iPrimeiroNum = Double.parseDouble(utilitarios.readLineFromConsole("insira o Primeiro Número"));
                        iSegundoNum = Double.parseDouble(utilitarios.readLineFromConsole("insira o Segundo Número"));
                        controller = new Controller(iPrimeiroNum, iSegundoNum);
                        System.out.printf("A soma entre os dois inseridos é %.2f", controller.Soma());
                        bGuardar = utilitarios.confirma("Deseja Guardar o Resultado?\n [S/N]");
                        if (bGuardar)
                            iResultado = controller.Soma();
                        break;
                    case "2":
                        if (iResultado!=0){
                            bGuardar = utilitarios.confirma("Deseja Usar o Resultado Previamente Guardado?\n [S/N]");
                            if (bGuardar){
                                iSegundoNum = Double.parseDouble(utilitarios.readLineFromConsole("insira o Segundo Número"));
                                controller=new Controller(iResultado,iSegundoNum);
                                System.out.printf("A Subtração entre os dois inseridos é %.2f", controller.Substracao());
                                bGuardar = utilitarios.confirma("Deseja Guardar o Resultado?\n [S/N]");
                                if (bGuardar)
                                    iResultado = controller.Substracao();
                            }
                        }
                        iPrimeiroNum = Double.parseDouble(utilitarios.readLineFromConsole("insira o Primeiro Número"));
                        iSegundoNum = Double.parseDouble(utilitarios.readLineFromConsole("insira o Segundo Número"));
                        controller = new Controller(iPrimeiroNum, iSegundoNum);
                        System.out.printf("A subtração entre os dois inseridos é %.2f", controller.Substracao());
                        bGuardar = utilitarios.confirma("Deseja Guardar o Resultado?\n [S/N]");
                        if (bGuardar)
                            iResultado = controller.Substracao();
                        break;
                    case "3":
                        if (iResultado!=0){
                            bGuardar = utilitarios.confirma("Deseja Usar o Resultado Previamente Guardado?\n [S/N]");
                            if (bGuardar){
                                iSegundoNum = Double.parseDouble(utilitarios.readLineFromConsole("insira o Segundo Número"));
                                controller=new Controller(iResultado,iSegundoNum);
                                System.out.printf("A Multiplicação entre os dois inseridos é %.2f", controller.Multiplica());
                                bGuardar = utilitarios.confirma("Deseja Guardar o Resultado?\n [S/N]");
                                if (bGuardar)
                                    iResultado = controller.Multiplica();
                            }}
                        iPrimeiroNum = Double.parseDouble(utilitarios.readLineFromConsole("insira o Primeiro Número"));
                        iSegundoNum = Double.parseDouble(utilitarios.readLineFromConsole("insira o Segundo Número"));
                        controller = new Controller(iPrimeiroNum, iSegundoNum);
                        System.out.printf("A multiplicação entre os dois inseridos é %.2f", controller.Multiplica());
                        bGuardar = utilitarios.confirma("Deseja Guardar o Resultado?\n [S/N]");
                        if (bGuardar)
                            iResultado = controller.Multiplica();
                        break;
                    case "4":
                        if (iResultado!=0){
                            bGuardar = utilitarios.confirma("Deseja Usar o Resultado Previamente Guardado?\n [S/N]");
                            if (bGuardar){
                                iSegundoNum = Double.parseDouble(utilitarios.readLineFromConsole("insira o Segundo Número"));
                                controller=new Controller(iResultado,iSegundoNum);
                                System.out.printf("A Divisão entre os dois inseridos é %.2f", controller.Divisao());
                                bGuardar = utilitarios.confirma("Deseja Guardar o Resultado?\n [S/N]");
                                if (bGuardar)
                                    iResultado = controller.Divisao();
                            }}
                        iPrimeiroNum = Double.parseDouble(utilitarios.readLineFromConsole("insira o Primeiro Número"));
                        iSegundoNum = Double.parseDouble(utilitarios.readLineFromConsole("insira o Segundo Número"));
                        controller = new Controller(iPrimeiroNum, iSegundoNum);
                        System.out.printf("A divisão entre os dois inseridos é %.2f", controller.Divisao());
                        bGuardar = utilitarios.confirma("Deseja Guardar o Resultado?\n [S/N]");
                        if (bGuardar)
                            iResultado = controller.Divisao();
                        break;
                    case "5":
                        if (iResultado!=0){
                            bGuardar = utilitarios.confirma("Deseja Usar o Resultado Previamente Guardado?\n [S/N]");
                            if (bGuardar){
                                iSegundoNum = Double.parseDouble(utilitarios.readLineFromConsole("insira o Segundo Número"));
                                controller=new Controller(iResultado,iSegundoNum);
                                System.out.printf("o Resultado é %.2f", controller.Potencia());
                                bGuardar = utilitarios.confirma("Deseja Guardar o Resultado?\n [S/N]");
                                if (bGuardar)
                                    iResultado = controller.Potencia();
                            }}
                        iPrimeiroNum = Double.parseDouble(utilitarios.readLineFromConsole("insira o Primeiro Número"));
                        iSegundoNum = Double.parseDouble(utilitarios.readLineFromConsole("insira o Segundo Número"));
                        controller = new Controller(iPrimeiroNum, iSegundoNum);
                        System.out.printf("o Resultado é %.2f", controller.Potencia());
                        bGuardar = utilitarios.confirma("Deseja Guardar o Resultado?\n [S/N]");
                        if (bGuardar)
                            iResultado = controller.Potencia();
                        break;
                    case "6":
                        if (iResultado!=0){
                            bGuardar = utilitarios.confirma("Deseja Usar o Resultado Previamente Guardado?\n [S/N]");
                            if (bGuardar){
                                iSegundoNum = Double.parseDouble(utilitarios.readLineFromConsole("insira o Segundo Número"));
                                controller=new Controller(iResultado,iSegundoNum);
                                System.out.printf("O factorial entre os dois inseridos é %.2f", controller.Fatorial());
                                bGuardar = utilitarios.confirma("Deseja Guardar o Resultado?\n [S/N]");
                                if (bGuardar)
                                    iResultado = controller.Fatorial();
                            }}
                        iPrimeiroNum = Double.parseDouble(utilitarios.readLineFromConsole("insira o Primeiro Número"));
                        iSegundoNum = Double.parseDouble(utilitarios.readLineFromConsole("insira o Segundo Número"));
                        controller = new Controller(iPrimeiroNum, iSegundoNum);
                        System.out.printf("O factorial entre os dois inseridos é %.2f", controller.Fatorial());
                        bGuardar = utilitarios.confirma("Deseja Guardar o Resultado?\n [S/N]");
                        if (bGuardar)
                            iResultado = controller.Fatorial();
                        break;
                    case "7":
                        if (iResultado!=0){
                            bGuardar = utilitarios.confirma("Deseja Usar o Resultado Previamente Guardado?\n [S/N]");
                            if (bGuardar){
                                iSegundoNum = Double.parseDouble(utilitarios.readLineFromConsole("insira o Segundo Número"));
                                controller=new Controller(iResultado);
                                if (controller.Primo()) {
                                    System.out.printf("O número é primo", controller.Primo());
                                } else {
                                    System.out.println("O número não é primo");
                            }}}
                        iPrimeiroNum = Double.parseDouble(utilitarios.readLineFromConsole("insira o Número"));
                        controller = new Controller(iPrimeiroNum);
                        if (controller.Primo()) {
                            System.out.printf("O número é primo", controller.Primo());
                        } else {
                            System.out.println("O número não é primo");
                        }
                        bGuardar = utilitarios.confirma("Deseja Guardar o Resultado?\n [S/N]");
                        if (bGuardar)
                            iResultado = iPrimeiroNum;
                        break;
                    case "8":
                        if (iResultado!=0){
                            bGuardar = utilitarios.confirma("Deseja Usar o Resultado Previamente Guardado?\n [S/N]");
                            if (bGuardar){
                                controller=new Controller(iResultado);
                                System.out.printf("O resultado com o numero introduzido é %s",controller.SomaCubo());
                                bGuardar = utilitarios.confirma("Deseja Guardar o Resultado?\n [S/N]");
                                    iResultado = controller.Fatorial();
                            }}
                        iPrimeiroNum = Double.parseDouble(utilitarios.readLineFromConsole("insira o Primeiro Número"));
                        controller = new Controller(iPrimeiroNum);
                        System.out.printf("O resultado com o numero introduzido é %s",controller.SomaCubo());
                        bGuardar = utilitarios.confirma("Deseja Guardar o Resultado?\n [S/N]");
                        if (bGuardar)
                            iResultado = iPrimeiroNum;
                        break;
                    case "9":
                        if (iResultado!=0){
                            bGuardar = utilitarios.confirma("Deseja Usar o Resultado Previamente Guardado?\n [S/N]");
                            if (bGuardar){
                                controller=new Controller(iResultado);
                                System.out.printf("A conversão do número inteiro %.0f para Binário : %s", iResultado, controller.Int2Bin());
                                bGuardar = utilitarios.confirma("Deseja Guardar o Resultado?\n [S/N]");
                                iResultado = Double.parseDouble(controller.Int2Bin());
                            }}
                        iPrimeiroNum = Double.parseDouble(utilitarios.readLineFromConsole("insira o Primeiro Número"));
                        controller = new Controller(iPrimeiroNum);
                        System.out.printf("A conversão do número inteiro %.0f para Binário : %s", iPrimeiroNum, controller.Int2Bin());
                        bGuardar = utilitarios.confirma("Deseja Guardar o Resultado?\n [S/N]");
                        if (bGuardar)
                            iResultado = Double.parseDouble(controller.Int2Bin());
                        break;
                        
                    case "10":
                        iPrimeiroNum = Double.parseDouble(utilitarios.readLineFromConsole("insira o Primeiro Número"));
                        controller = new Controller(iPrimeiroNum);
                        System.out.printf("A conversão do número inteiro %.0f para Hexadecimal : %s", iPrimeiroNum, controller.Int2Hex());
                        bGuardar = utilitarios.confirma("Deseja Guardar o Resultado?\n [S/N]");
                        if (bGuardar)
                            iResultado = Double.parseDouble(controller.Int2Hex());
                        break;

                    case "11":
                        iPrimeiroNum = Double.parseDouble(utilitarios.readLineFromConsole("insira o Primeiro Número"));
                        controller = new Controller(iPrimeiroNum);
                        System.out.printf("A conversão do número binário %.0f para decimal: %s", iPrimeiroNum, controller.BinaryToDecimal());
                        bGuardar = utilitarios.confirma("Deseja Guardar o Resultado?\n [S/N]");
                        if (bGuardar)
                            iResultado = Double.parseDouble(controller.BinaryToDecimal());
                        break;
                    case "12":
                        bGuardar = utilitarios.confirma("Deseja Apagar o Resultado?\n [S/N]");
                        if(bGuardar)
                        iResultado=0;
                        break;
                    case "13":

                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } while (!Opcao.equalsIgnoreCase("0"));
}}


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


