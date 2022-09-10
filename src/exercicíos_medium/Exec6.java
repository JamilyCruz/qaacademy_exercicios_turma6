package exercicíos_medium;
//Faça um algoritmo para ler um número inteiro, calcular e exibir o Fatorial do número digitado.
// Ex.: Digitou 10. 10*(10-1)*(10-2)*(10-3).. *(10-1) = 3.628.800

import javax.swing.*;

public class Exec6 {
    public static void main(String[] args) {
        int i=1, numdig=0;

        numdig = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
        i = numdig;
        while (i > 1) {
        numdig= numdig*(i-1);
        i--;}
        System.out.println("O valor fatorial é " + numdig);
    }
}
