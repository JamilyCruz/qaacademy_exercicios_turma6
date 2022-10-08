package exercicios_medium;

//Faça um algoritmo para calcular e exibir a soma de todos os números de 0 a 1000.
// E parar se caso a soma atingir 1500(ou mais).

public class Exec3 {
    public void calculoSoma() {
        int i = 0, soma = 0;
        while (i < 1000 && soma < 1500) {
            soma = i + soma;
            i++;
            System.out.println("contador: " + i + " soma: " + soma);
        }
    }
}
