package exercicios_easy;
//5 - Faça um algoritmo para ler três números inteiros,armazenar em variáveis, e exibir a soma, a subtração, multiplicação e a média dos três números digitados.

import javax.swing.*;

public class Exec5 {
    public static void main(String[] args) {
        int num1, num2, num3;
//Ler
        num1=Integer.parseInt(JOptionPane.showInputDialog("digite um número inteiro"));
        num2=Integer.parseInt(JOptionPane.showInputDialog("digite outro número inteiro"));
        num3=Integer.parseInt(JOptionPane.showInputDialog("digite mais um número inteiro"));
//Exibir
        System.out.println("A soma dos numeros é "+(num1+num2+num3));
        System.out.println("A subtração dos numeros é "+(num1-num2-num3));
        System.out.println("A multiplicação dos numeros é "+(num1*num2*num3));
        System.out.println("A média dos numeros é "+(num1+num2+num3)/3);

    }
}
