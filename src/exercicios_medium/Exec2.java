package exercicios_medium;

//Exercício 2 Faça um algoritmo para ler um valor de investimento, com uma taxa de juros de 5% a.a.
// Ao final de 10 anos, exibir o valor investido, valor dos juros, e o total. Considerando que a remuneração
// será no regime de juros compostos.

public class Exec2 {
    public void calculoIvestimento(double valorInv) {
        double valorJuros = 0, taxaJuros = 0.05, valorTotal = 0;
        int ano = 0;

            while (ano <= 10) {
            valorJuros = ((valorInv + valorJuros) * taxaJuros) + valorJuros;
            valorTotal = valorJuros + valorInv;
            System.out.println("OS VALORES DO ANO " +ano+" SERÃO DE: ");
            System.out.println("Com o valor investido de " + valorInv);
            System.out.println("O valor dos juros será de " + valorJuros);
            System.out.println("O valor o total será de " + valorTotal);
            ano = ano + 1;
        }
    }
}