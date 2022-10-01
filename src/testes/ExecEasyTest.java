package testes;

import exercicios_easy.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ExecEasyTest {
    @Test
    public void testeDeJuncaoPalavra(){
        Exec2 exec2=new Exec2();
        String retorno = exec2.nome("Jamily Cruz");
        assertEquals("O nome digitado é: Jamily Cruz",retorno);
    }
    @Test
    public void nomeTrocado(){
        Exec3 exec3=new Exec3();
        String nome=exec3.nometrocado("Jamily", "Cruz");
        assertEquals("O nome é: Cruz Jamily", nome);
}
    @Test
    public void testeDobro(){
        Exec4 exec4=new Exec4();
        int dobro=exec4.calcularDobro(10);
        assertEquals(20, dobro);
    }

    @Test
    public void calculo(){
        Exec5 exec5=new Exec5();
        int soma=exec5.soma(10,5,6);
        assertEquals(21, soma);
        int subtracao= exec5.sub(20,5,5);
        assertEquals(10, subtracao);
        int media= exec5.media(10,10,10);
        assertEquals(10, media);
        int multiplicacao= exec5.multi(2,2,2);
        assertEquals(8, multiplicacao);
    }

    @Test
    public void media(){
        Exec6 exec6=new Exec6();
        int media= exec6.mediafinal(10,10);
        assertEquals(10, media);
    }

    @Test
    public void salario(){
        Exec7 exec7=new Exec7();
        String imposto= exec7.salario(2555.58);
        assertEquals("O valor do INSS a ser pago é 306.6696", imposto);
    }

    @Test
    public void calcularIR(){
        Exec8 exec8=new Exec8();
        exec8.calcularIr(2899.85);
        assertEquals("O valor do seu imposto de renda é 80.17749999999995O valor do seu salario bruto é 2899.85O valor do seu salario liquido é 2819.6725", exec8.calcularIr(2899.85));
    }

    @Test
    public void tabuada(){
        Exec9 exec9=new Exec9();
        exec9.calcularTabuada(9);
        assertEquals("9 * 10 = 90", exec9.calcularTabuada(9));
    }
    @Test
    public void investimento(){
        Exec10 exec10=new Exec10();
        exec10.investimento(2000);
        assertEquals("O valor investido é de 2000.0 - O valor dos juros é de 100.0 - O valor o total com juros após 10 anos será de 3000.0", exec10.investimento(2000));
    }
    @Test
    public void Calculadora(){
        Exec11 exec11=new Exec11();
        exec11.calculadora(10);
        assertEquals("A soma é final é: 210", exec11.calculadora(10));
    }


}
