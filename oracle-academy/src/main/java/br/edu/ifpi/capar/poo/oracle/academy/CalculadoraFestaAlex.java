package br.edu.ifpi.capar.poo.oracle.academy;

/**
 *
 * @author Denylson Melo
 */
public class CalculadoraFestaAlex {

    private static double VALOR_IMPOSTO = 0.05;
    protected static final double VALOR_GORJETA = 0.15;
    public double valor = 0;

    void encontrarTotalAPagar() {
        System.out.println("person: $" + this.valor * (1 + VALOR_IMPOSTO + VALOR_GORJETA));
    }
    
    void encontrarTotalAPagar(double valor) {
        
        System.out.println("person: $" + valor * (1 + VALOR_IMPOSTO + VALOR_GORJETA));
    
    }

    void encontrarTotalAPagar(int valor) {
        System.out.println("person: $" + valor * (1 + VALOR_IMPOSTO + VALOR_GORJETA));
        //return 0;
    }

    void encontrarTotalAPagar(int valor, double valorImposto) {
        System.out.println("person: $" + valor * (1 + valorImposto));
        //return 0;
    }
    
    void metodo(String... variavel){
        
        
        for (String minhaVariavelzinha : variavel) {
            System.out.println(minhaVariavelzinha);
        }
        
        /*  diferenca dos for
        for (int i = 0; i < variavel.length; i++) {
            System.out.println(variavel[i]);
        }*/
    }
}
