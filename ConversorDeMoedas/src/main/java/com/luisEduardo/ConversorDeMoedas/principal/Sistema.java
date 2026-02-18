package com.luisEduardo.ConversorDeMoedas.principal;
import com.luisEduardo.ConversorDeMoedas.service.ConversorMoedas;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Sistema {

    private Scanner input = new Scanner(System.in);
    private ConversorMoedas conversorMoedas = new ConversorMoedas();
    private DecimalFormat df = new DecimalFormat("0.000");

    private String menu = """
            \n\n
            ============================================
                       CONVERSOR DE MOEDAS
            ============================================
            Escolha a conversão desejada:
            
            1) Dólar =>> Peso argentino
            2) Peso argentino =>> Dólar
            3) Dólar =>> Real brasileiro
            4) Real brasileiro =>> Dólar
            5) Dólar =>> Peso colombiano
            6) Peso colombiano =>> Dólar
            0) Sair
            
            Digite a opção:    """;


    public void menu() {
        int option = -1;

        do {
            System.out.println(menu);
            try {
                option = Integer.parseInt(input.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Insira um número correspondente a uma opção no menu!");
            }
            switch (option) {
                case 1: {
                    buscarConversaoDolarParaArgentino();
                    break;
                }

                case 2: {
                    buscarConversaoArgentinoParaDolar();
                    break;
                }

                case 3: {
                    buscarConversaoDolarParaReal();
                    break;
                }

                case 4: {
                    buscarConversaoRealParaDolar();
                    break;
                }

                case 5: {
                    buscarConversaoDolarParaColombiano();
                    break;
                }

                case 6: {
                    buscarConversaoColombianoParaDolar();
                    break;
                }

                case 0: {
                    break;
                }

                default: {
                    System.out.println("\nOpção Inválida!\n");
                    break;
                }
            }
        }
        while (option != 0);


    }

    private void buscarConversaoDolarParaArgentino() {
        System.out.println("\nDigite o valor em dólares para converter para pesos argentinos: ");
        double valor = Double.parseDouble(input.nextLine());

        System.out.println("\nValor em (ARS):    "+ df.format(conversorMoedas.dolarParaArgentino(valor)));

    }

    private void buscarConversaoArgentinoParaDolar() {
        System.out.println("\nDigite o valor em pesos argentinos para converter para dólares: ");
        double valor = Double.parseDouble(input.nextLine());

        System.out.println("\nValor em (USD):    "+  df.format(conversorMoedas.argentinoParaDolar(valor)));
    }

    private void buscarConversaoDolarParaReal() {
        System.out.println("\nDigite o valor em dólar para converter para reais: ");
        double valor = Double.parseDouble(input.nextLine());

        System.out.println("\nValor em (BRL):    "+  df.format(conversorMoedas.dolarParaReal(valor)));
    }

    private void buscarConversaoRealParaDolar() {
        System.out.println("\nDigite o valor em reais para converter para dólares: ");
        double valor = Double.parseDouble(input.nextLine());

        System.out.println("\nValor em (USD):    "+  df.format(conversorMoedas.realParaDolar(valor)));
    }

    private void buscarConversaoDolarParaColombiano() {
        System.out.println("\nDigite o valor em dólares para converter para pesos colombianos: ");
        double valor = Double.parseDouble(input.nextLine());

        System.out.println("\nValor em (COP):    "+  df.format(conversorMoedas.dolarParaColombiano(valor)));
    }

    private void buscarConversaoColombianoParaDolar() {
        System.out.println("\nDigite o valor em pesos colombianos para converter para dólares: ");
        double valor = Double.parseDouble(input.nextLine());

        System.out.println("\nValor em (USD):    "+  df.format(conversorMoedas.colombianoParaDolar(valor)));
    }

}
