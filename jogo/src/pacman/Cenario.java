/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacman;

public class Cenario {
    
    private int altura;
    private int largura;
    private Fantasma fantasma1;
    private Fantasma fantasma2;
    private Fantasma fantasma3;
    private Fantasma fantasma4;
    private int quantParedes;
    private int quantPontos;
    private int quantCerejas;
    private int quantEspeciais;

    public Cenario(int altura, int largura, int quantParedes, int quantPontos, int quantCerejas, int quantEspeciais) {
        this.altura = altura;
        this.largura = largura;
        this.quantParedes = quantParedes;
        this.quantPontos = quantPontos;
        this.quantCerejas = quantCerejas;
        this.quantEspeciais = quantEspeciais;
    }

    public Cenario() {
        
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getLargura() {
        return largura;
    }

    public void setLargura(int largura) {
        this.largura = largura;
    }

    public int getQuantParedes() {
        return quantParedes;
    }

    public void setQuantParedes(int quantParedes) {
        this.quantParedes = quantParedes;
    }

    public int getQuantPontos() {
        return quantPontos;
    }

    public void setQuantPontos(int quantPontos) {
        this.quantPontos = quantPontos;
    }

    public int getQuantCerejas() {
        return quantCerejas;
    }

    public void setQuantCerejas(int quantCerejas) {
        this.quantCerejas = quantCerejas;
    }

    public int getQuantEspeciais() {
        return quantEspeciais;
    }

    public void setQuantEspeciais(int quantEspeciais) {
        this.quantEspeciais = quantEspeciais;
    }

    public Fantasma getFantasma1() {
        return fantasma1;
    }

    public void setFantasma1(Fantasma fantasma1) {
        this.fantasma1 = fantasma1;
    }

    public Fantasma getFantasma2() {
        return fantasma2;
    }

    public void setFantasma2(Fantasma fantasma2) {
        this.fantasma2 = fantasma2;
    }

    public Fantasma getFantasma3() {
        return fantasma3;
    }

    public void setFantasma3(Fantasma fantasma3) {
        this.fantasma3 = fantasma3;
    }

    public Fantasma getFantasma4() {
        return fantasma4;
    }

    public void setFantasma4(Fantasma fantasma4) {
        this.fantasma4 = fantasma4;
    }
    
    
    
    
}
