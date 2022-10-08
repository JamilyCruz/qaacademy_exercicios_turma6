package exercicios_medium;

//Exercício 09 - Faça um algoritmo para:
//Criar dois vetores.
//Em um vetor: ler e armazenar o nomes de alunos.
//No outro vetor: ler e armazenar a numeração de cada aluno, de acordo com a ordem inserida no vetor de nomes.
//E exiba, o Nome e o número correspondente de cada um.

import javax.swing.*;

public class Exec9 {
    public void aluno() {
        String nome[] = new String[3];
        int num[] = new int[3];
        String pesquisa[] = new String[3];

        nome[0] = (JOptionPane.showInputDialog("Digite o primeiro nome"));
        num[0] = Integer.parseInt(JOptionPane.showInputDialog("Digite seu número correspondente"));
        pesquisa[0] = (nome[0]+"-"+num[0]);

        nome[1] = (JOptionPane.showInputDialog("Digite o segundo nome"));
        num[1] = Integer.parseInt(JOptionPane.showInputDialog("Digite seu número correspondente"));
        pesquisa[1]= (nome[1]+"-"+num[1]);

        nome[2] = (JOptionPane.showInputDialog("Digite o terceiro nome"));
        num[2] = Integer.parseInt(JOptionPane.showInputDialog("Digite seu número correspondente"));
        pesquisa[2]= (nome[2]+"-"+num[2]);


        int dig = Integer.parseInt(JOptionPane.showInputDialog("Qual a posição do aluno deseja pesquisar?"));
        System.out.println("O nome do aluno e numero do aluno na posição : "+dig+" é "+pesquisa[dig-1]);

//        pesquisa = (JOptionPane.showInputDialog("digite qual aluno deseja pesquisar, exemplo: aluno1"));
//        if (pesquisa.equals("aluno1")){
//            System.out.println("O aluno é " + aluno1);
//        }
//        if (pesquisa.equals("aluno2")){
//            System.out.println("O aluno é " + aluno2);
//        }
//        if (pesquisa.equals("aluno3")){
//            System.out.println("O aluno é " + aluno3);
//        }
    }
}
