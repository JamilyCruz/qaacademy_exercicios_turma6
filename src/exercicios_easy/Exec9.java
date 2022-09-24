package exercicios_easy;

//Exercício 9 - Faça um algoritmo para ler um número inteiro entre: 1 a 10,
//calcular e exibir a tabuada deste número digitado. Ex.: 10 x 1 = 10, .., 10 x 10 = 100.

public class Exec9 {
    public String calcularTabuada(int tabuada) {
        int calculo = 1;
        while (calculo <= 10) {
            System.out.println(tabuada + " * " + calculo + " = " + tabuada * calculo);
            calculo = calculo + 1;
        }
        return null;
    }

//int tabuada, calculo;
//calculo=1;
//Ler
//  tabuada=Integer.parseInt(JOptionPane.showInputDialog("digite qual valor vc deseja ver a tabuada"));
//  while (calculo<=10) {
//  System.out.println(tabuada+" * "+calculo+" = "+tabuada*calculo);
//  calculo=calculo+1;
//  }

}
