/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacman;

public class Fantasma {
    
    private String cor;
    private int velocidade;
    private boolean vuneravel;

    public Fantasma(String cor, int velocidade, boolean vuneravel){
        this.cor = cor;
        this.velocidade = velocidade;
        this.vuneravel = vuneravel;
    }

    Fantasma() {
        
    }
    
    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public boolean isVuneravel() {
        return vuneravel;
    }

    public void setVuneravel(boolean vuneravel) {
        this.vuneravel = vuneravel;
    }
    
    
    
    
}
