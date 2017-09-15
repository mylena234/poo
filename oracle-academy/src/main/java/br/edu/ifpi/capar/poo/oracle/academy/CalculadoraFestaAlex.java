package br.edu.ifpi.capar.poo.oracle.academy;

/**
 *
 * @author Denylson Melo
 */
public class CalculadoraFestaAlex {

    private static final double VALOR_IMPOSTO = 0.05;
    private static final double VALOR_GORJETA = 0.15;
    
    void encontrarTotalAPagar(double valor) {
        System.out.println("person: $" + valor * (1 + VALOR_IMPOSTO + VALOR_GORJETA));
    }

    void encontrarTotalAPagar(int valor) {
        System.out.println("person: $" + valor * (1 + VALOR_IMPOSTO + VALOR_GORJETA));
    }

    void encontrarTotalAPagar(int valor, double valorImposto) {
        System.out.println("person: $" + valor * (1 + valorImposto + VALOR_GORJETA));
    }

    void encontrarTotalAPagar(double valor, double valorImposto) {
        System.out.println("person: $" + valor * (1 + valorImposto + VALOR_GORJETA));
    }
}
