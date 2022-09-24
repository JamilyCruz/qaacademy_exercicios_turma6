package exemplos;

public class MetodosComParametrosMain {
    public static void main(String[] args) {
        nome("Jamily", "Cruz");
        cidade1("Osasco", "SP");
        time("Timão", "Corinthians");
        cor("Preto", "Branco");
        bebida("Agua", "Suco");
        pais("Brasil", "Argentina");
        estado("São Paulo", "Minas Gerais");
        cidade("Osasco", "Barueri");
        bairro("Conceição", "Novo Osasco");
        soma(5, 10);
    }

    public static void nome(String a, String b) {
        System.out.println("O nome é " + a +" "+ b);
    }

    public static void cidade1(String a, String b) {
        System.out.println("A cidade é " + a +"-"+b);
    }

    public static void time(String a, String b) {
        System.out.println("O time é " + a +"-"+ b);
    }

    public static void cor(String a, String b) {
        System.out.println("As cores são " + a +"-"+ b);
    }

    public static void bebida(String a, String b) {
        System.out.println("As bebidas são " + a +"-"+ b);
    }

    public static String pais(String a, String b) {
        System.out.println("Os paises são: "+ a +"-"+ b);
        return a + b;
    }

    public static String estado(String a, String b) {
        System.out.println("Os estados são: "+ a +"-"+ b);
        return a + b;
    }

    public static String cidade(String a, String b)  {
        System.out.println("As cidades são: "+ a +"-"+ b);
        return a + b;
    }

    public static String bairro(String a, String b)  {
        System.out.println("Os bairros são: "+ a +"-"+ b);
        return a + b;
    }

    public static int soma (int num1, int num2)  {
        System.out.println("A soma é "+ (num1+num2));
        return num1+num2;
    }
}