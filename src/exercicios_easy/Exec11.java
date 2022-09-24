package exercicios_easy;

//Exercício 11 - Faça um algoritmo para ler um número inteiro, somar 2 ao número digitado, até completar 100 iterações.
// Por ex.: Digitou 10. 10+2, 12+2, 14+2, Até completar 100 iterações.

import javax.swing.*;

public class Exec11 {
    public String calculadora(int num1) {
        int i = 1;

        while (i <= 100) {
            num1 = num1 + 2;
            System.out.println("A soma é: " + num1);
            i = i + 1;
        }
        return "A soma é final é: " + num1;
    }
}

//        int num1, i;
//        i=1;
//        num1=Integer.parseInt(JOptionPane.showInputDialog("digite o numero que deseja calcular"));
//        while (i<=100) {
//            num1=num1+2;
//            System.out.println("A soma é: "+num1);
//            i=i+1;
//        }


