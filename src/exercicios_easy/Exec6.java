package exercicios_easy;
//6 - Faça um algoritmo para ler duas notas, calcular a média. E SE - a média > 5 Exibir aprovado, SE a média < 5 exibir reprovado, se media = 5 exibir exame.

import javax.swing.*;

public class Exec6 {
    public String media(int nota1, int nota2) {
       int media=(nota1+nota2)/2;
       String retorno=" ";
       if (media>5){
           retorno = "Você foi Aprovado!";}
       if(media<5){
           retorno = "Que pena, você foi Reprovado!";}
       if(media==5){
           retorno = "Não desista, você ficou de recuperação!";}
       return retorno;
    }
}

//        int nota1, nota2, media;
////Ler
//        nota1=Integer.parseInt(JOptionPane.showInputDialog("digite a primera nota do aluno"));
//        nota2=Integer.parseInt(JOptionPane.showInputDialog("digite a segunda nota do aluno"));
//        media=(nota1+nota2)/2;
////Condição
//        if(media>5){
//            System.out.println("Você foi Aprovado!");
//        }
//
//        if(media<5){
//            System.out.println("Que pena, você foi Reprovado!");
//        }
//
//        if(media==5){
//            System.out.println("Não desista, você ficou de recuperação!");
//        }
//
//    }

