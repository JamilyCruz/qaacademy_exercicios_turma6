package exercicios_medium;
//Faça um algoritmo para ler 5 números, verificar e exibir, quais dos 5 números digitados, é o menor.

public class Exec5 {
    public void menorNum(int numdig) {
        int i=1, menor=0;

        while (i <= 5) {
           if (numdig <= menor || i==1)
            menor=numdig;
            i++;
        }
        System.out.println("O menor numero digitado foi " + menor);
    }
}


//    if (num1<num2 && num1<num3 && num1<num4 && num1<num5){
//    System.out.println("O menor valor dos 5 numeros digitados é " + num1);
//    }
//
//    if (num2<num1 && num2<num3 && num2<num4 && num2<num5) {
//    System.out.println("O menor valor dos 5 numeros digitados é " + num2);
//    }
//
//    if (num3<num1 && num3<num2 && num3<num4 && num3<num5) {
//    System.out.println("O menor valor dos 5 numeros digitados é " + num3);
//    }
//
//    if (num4<num1 && num4<num2 && num4<num3 && num4<num5) {
//    System.out.println("O menor valor dos 5 numeros digitados é " + num4);
//    }
//
//    if (num5<num1 && num5<num2 && num5<num3 && num5<num4) {
//    System.out.println("O menor valor dos 5 numeros digitados é " + num5);
//    }

