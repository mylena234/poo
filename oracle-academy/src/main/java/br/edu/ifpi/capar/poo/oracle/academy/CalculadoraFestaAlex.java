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
        System.out.println("person: $" + valor * (1 + VALOR_IMPOSTO + VALOR_GORJETA));
    }

}
