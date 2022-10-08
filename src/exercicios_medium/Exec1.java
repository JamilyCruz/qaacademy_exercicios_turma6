package exercicios_medium;

//Exercício 1 - Faça um algoritmo para verificar e exibir de 0 a 100, quais são os números Pares e ímpares.

public class Exec1 {
    public void exibirParImpar() {

    int i=0;
    int num1=0;

    while (i<=100) {
    num1=num1+1;
    i=i+1;

        if (num1%2==0){
    System.out.println(num1+" = Par");}
        else{
    System.out.println(num1 + " = Impar");
    }
   }
  }
}
