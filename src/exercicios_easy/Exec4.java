package exercicios_easy;
//Faça um algoritmo para ler um número inteiro, armazenar em uma variável, calcular o dobro, e exibir.

import javax.swing.*;

public class Exec4 {
    public static void main(String[] args) {
    //Declarar a variavel
        int num1, result;

        //Ler
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));

        result=num1*2;

        //Exibir
        System.out.println("O dobro é " +result);

    }
}
