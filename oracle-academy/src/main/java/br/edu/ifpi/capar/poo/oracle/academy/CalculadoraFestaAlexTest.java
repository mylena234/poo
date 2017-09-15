package br.edu.ifpi.capar.poo.oracle.academy;

import java.util.Scanner;

/**
 *
 * @author Denylson Melo
 */
public class CalculadoraFestaAlexTest {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        CalculadoraFestaAlex galas = new CalculadoraFestaAlex();
        CalculadoraFestaAlex tawan = new CalculadoraFestaAlex();
        CalculadoraFestaAlex eric = new CalculadoraFestaAlex();
        
        /*
        System.out.println("galas " + calculadora1.valor);
        System.out.println("tawan " + calculadora2.valor);
        
        calculadora1.valor = 100;   // 120
        calculadora1.encontrarTotalAPagar();
       
        System.out.println("galas " + calculadora1.valor);
        System.out.println("tawan " + calculadora2.valor);
        
        calculadora1.valor = 200;    //240
        calculadora1.encontrarTotalAPagar();
        
        calculadora2.valor = 300;    //360
        calculadora2.encontrarTotalAPagar();
        
        //   ??????????
        
        calculadora1.VALOR_IMPOSTO = 2; // nao pode pois é publico
        
        calculadora1.encontrarTotalAPagar();
*/
        
        galas.encontrarTotalAPagar(100, 0.3);
        
        galas.metodo("1", "2", "3", "alguma coisa");
        
        
        
        
    }
}
