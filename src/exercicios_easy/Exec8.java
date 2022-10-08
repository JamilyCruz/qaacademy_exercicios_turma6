package exercicios_easy;

//Exercício 8 - Faça um algoritmo para ler um valor de salário, calcular e exibir o valor do salário bruto, valor do
//salário líquido e o valor do imposto de renda. Respeitando a tabela abaixo:

public class Exec8 {
    public String calcularIr(double salarioBruto) {
        String calculo = " ";

        if (salarioBruto<=1903.98) {
            double ir=(salarioBruto*1)-0;
            calculo= ("Isento de Imposto de Renda");
//          calculo= ("O valor do seu imposto de renda é " + ir)+("O valor do seu salario bruto é " + salarioBruto)+("O valor do seu salario liquido é " + (salarioBruto - ir));
        }
        if (salarioBruto>=1903.99&&salarioBruto<=2826.65) {
            double ir= ((salarioBruto*0.075)-142.80);
            calculo=("O valor do seu imposto de renda é " + ir)+("O valor do seu salario bruto é " + salarioBruto)+("O valor do seu salario liquido é " + (salarioBruto - ir));
        }
        if (salarioBruto>=2826.66&&salarioBruto<=3751.05) {
            double ir= ((salarioBruto*0.15)-354.80);
            calculo=("O valor do seu imposto de renda é " + ir)+("O valor do seu salario bruto é " + salarioBruto)+("O valor do seu salario liquido é " + (salarioBruto - ir));
        }
        if (salarioBruto>=3751.06&&salarioBruto<=4664.68) {
            double ir= ((salarioBruto*0.225)-636.13);
            calculo=("O valor do seu imposto de renda é " + ir)+("O valor do seu salario bruto é " + salarioBruto)+("O valor do seu salario liquido é " + (salarioBruto - ir));
        }
        if (salarioBruto>=4664.68) {
            double ir= ((salarioBruto*0.275)-869.36);
            calculo=("O valor do seu imposto de renda é " + ir)+("O valor do seu salario bruto é " + salarioBruto)+("O valor do seu salario liquido é " + (salarioBruto - ir));
        }
        return calculo;
    }
}

//        float salarioBruto, ir;
////Ler
//        salarioBruto=Float.parseFloat(JOptionPane.showInputDialog("digite o valor do salario"));
//
//        if (salarioBruto<=1903.98) {
//            ir=(salarioBruto*1)-0;
//            System.out.println("O valor do seu imposto de renda é " + ir);
//            System.out.println("O valor do seu salario bruto é " + salarioBruto);
//            System.out.println("O valor do seu salario liquido é " + (salarioBruto - ir));
//        }
//        if (salarioBruto>=1903.99&&salarioBruto<=2826.65) {
//            ir= (float) ((salarioBruto*0.075)-142.80);
//            System.out.println("O valor do seu imposto de renda é " + ir);
//            System.out.println("O valor do seu salario bruto é " + salarioBruto);
//            System.out.println("O valor do seu salario liquido é " + (salarioBruto - ir));
//        }
//        if (salarioBruto>=2826.66&&salarioBruto<=3751.05) {
//            ir= (float) ((salarioBruto*0.15)-354.80);
//            System.out.println("O valor do seu imposto de renda é " + ir);
//            System.out.println("O valor do seu salario bruto é " + salarioBruto);
//            System.out.println("O valor do seu salario liquido é " + (salarioBruto - ir));
//        }
//        if (salarioBruto>=3751.06&&salarioBruto<=4664.68) {
//            ir= (float) ((salarioBruto*0.225)-636.13);
//            System.out.println("O valor do seu imposto de renda é " + ir);
//            System.out.println("O valor do seu salario bruto é " + salarioBruto);
//            System.out.println("O valor do seu salario liquido é " + (salarioBruto - ir));
//        }
//        if (salarioBruto>=4664.68) {
//            ir= (float) ((salarioBruto*0.275)-869.36);
//            System.out.println("O valor do seu imposto de renda é " + ir);
//            System.out.println("O valor do seu salario bruto é " + salarioBruto);
//            System.out.println("O valor do seu salario liquido é " + (salarioBruto - ir));
//}   }   }
