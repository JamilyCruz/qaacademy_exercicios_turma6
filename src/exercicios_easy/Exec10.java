package exercicios_easy;

//Exercício 10 - Faça um algoritmo para ler um valor de investimento, com uma taxa de juros de 5% a.a.
//Ao final de 10 anos, exibir o valor investido, valor dos juros e o total com juros.
//Considerando que a remuneração será no regime de juros simples.

import javax.swing.*;

public class Exec10 {
    public String investimento(double valordoinvestimento) {
        double juros=0.05;
        int ano=1;
        double calculo=(valordoinvestimento*juros)*10;
        String retorno= ("O valor investido é de "+valordoinvestimento)+(" - O valor dos juros é de "+valordoinvestimento*juros)+(" - O valor o total com juros após 10 anos será de "+(valordoinvestimento+calculo));
        return retorno;
    }
}
//        double valorInv, juros=0.05, ano=1, retorno;
//        valorInv=Double.parseDouble(JOptionPane.showInputDialog("Digite o valor que deseja investir"));
//        retorno = (valorInv*juros)*10;
//
//        System.out.println("O valor investido é de "+valorInv);
//        System.out.println("O valor dos juros é de "+valorInv*juros);
//        System.out.println("O valor o total com juros após 10 anos será de "+retorno);
//    }
//}
