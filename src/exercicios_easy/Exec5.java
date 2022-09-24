package exercicios_easy;
//5 - Faça um algoritmo para ler três números inteiros,armazenar em variáveis, e exibir a soma, a subtração, multiplicação e a média dos três números digitados.

import javax.swing.*;

public class Exec5 {
    public int soma(int som1, int som2, int som3) {
        return (som1 + som2+ som3);
    }
    public int sub(int sub1, int sub2, int sub3) {
        return (sub1 - sub2 - sub3);
    }
    public int multi(int multi1, int multi2,int multi3) {
        return (multi1 * multi2 * multi3);
    }
    public int media(int media1, int media2, int media3) {
        return (media1 + media2 + media3) / 3;
    }
}



//        System.out.println("A soma dos números: "+num1+" "+ num2+" "+num3+" = "+(num1+num2+num3));
//        System.out.println("A subtração dos números: "+num1+" "+ num2+" "+num3+" = "+(num1-num2-num3));
//        System.out.println("A multiplicação dos números: "+num1+" "+ num2+" "+num3+" = "+(num1*num2*num3));
//        System.out.println("A média dos números: "+num1+" "+ num2+" "+num3+" = "+(num1+num2+num3)/3);
//        int num1, num2, num3;
////Ler
//        num1=Integer.parseInt(JOptionPane.showInputDialog("digite um número inteiro"));
//        num2=Integer.parseInt(JOptionPane.showInputDialog("digite outro número inteiro"));
//        num3=Integer.parseInt(JOptionPane.showInputDialog("digite mais um número inteiro"));
////Exibir
//        System.out.println("A soma dos numeros é "+(num1+num2+num3));
//        System.out.println("A subtração dos numeros é "+(num1-num2-num3));
//        System.out.println("A multiplicação dos numeros é "+(num1*num2*num3));
//        System.out.println("A média dos numeros é "+(num1+num2+num3)/3);


