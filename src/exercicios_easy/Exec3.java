package exercicios_easy;
//3 - Faça um algoritmo para ler dois valores, armazenar em variáveis, e exibir os valores das variáveis, trocados.

import javax.swing.*;

public class Exec3 {
    public static void main(String[] args) {
        String cidade, estado, auxiliar;
//Ler
        cidade= JOptionPane.showInputDialog("Digite a Cidade");
        estado= JOptionPane.showInputDialog("Digite o Estado");
        auxiliar=cidade;
//Troca
        cidade=estado;
        estado=auxiliar;
//Exibir
        System.out.println(cidade +" - "+  estado);
    }
}
