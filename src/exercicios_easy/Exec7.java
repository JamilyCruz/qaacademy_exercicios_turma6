package exercicios_easy;
//Exercício 7 - Faça um algoritmo para ler um valor de salário, calcular e exibir o
//valor do INSS a ser pago. Respeitando a tabela abaixo:

import javax.swing.*;

public class Exec7 {
    public static void main(String[] args) {

        float salario;
//Ler
        salario=Float.parseFloat(JOptionPane.showInputDialog("digite o valor do salario"));

//Condição

        if(salario<=1045.00){
        System.out.println(("O valor do INSS a ser pago é ")+salario*0.075);
        }

        if(salario>=1045.01&&salario<=2089.60){
        System.out.println(("O valor do INSS a ser pago é ")+salario*0.09);
        }

        if(salario>=2089.61&&salario<=3134.40){
        System.out.println(("O valor do INSS a ser pago é ")+salario*0.12);
        }

        if(salario>=3134.41){
        System.out.println(("O valor do INSS a ser pago é ")+salario*0.14);
        }

    }
}
