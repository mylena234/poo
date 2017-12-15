/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacman;

public class Pacman {

    private int velocidade;
    private int totalVidas;
    private boolean especial;
    private boolean capturado;
    private int pontosCapturados;

    public Pacman(int velocidade, int totalVidas, boolean especial, boolean capturado, int pontosCapturados) {
        this.velocidade = velocidade;
        this.totalVidas = totalVidas;
        this.especial = especial;
        this.capturado = capturado;
        this.pontosCapturados = pontosCapturados;
    }

    Pacman() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public int getTotalVidas() {
        return totalVidas;
    }

    public void setTotalVidas(int totalVidas) {
        this.totalVidas = totalVidas;
    }

    public boolean isEspecial() {
        return especial;
    }

    public void setEspecial(boolean especial) {
        this.especial = especial;
    }

    public boolean isCapturado() {
        return capturado;
    }

    public void setCapturado(boolean capturado) {
        this.capturado = capturado;
    }

    public int getPontosCapturados() {
        return pontosCapturados;
    }

    public void setPontosCapturados(int pontosCapturados) {
        this.pontosCapturados = pontosCapturados;
    }
    
    
    
    
}
