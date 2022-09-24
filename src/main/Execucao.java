package main;

import exemplos.MetodoSemMain;

public class Execucao {
    public static void main(String[] args) {
        MetodoSemMain metodo= new MetodoSemMain();

        metodo.subtracao(10,5);

        metodo.multiplicacao(10,2);

        metodo.nomeSobrenome("Mariana", "Mendes");

        System.out.println(metodo.multiplicacao());
        System.out.println(metodo.nomeSobrenome());

    }
}
