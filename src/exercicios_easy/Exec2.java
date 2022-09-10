package exercicios_easy;

import javax.swing.*;

//2-) Faça um algoritmo para ler e exibir uma palavra.
public class Exec2 {
    public static void main(String[] args) {
        //Declarar Variavel
        String nome;

        //Ler
        nome = JOptionPane.showInputDialog("Digite aqui seu nome");

        //exibir
        System.out.println("O nome digitado é: " + nome);

    }
}
