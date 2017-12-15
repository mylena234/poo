/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacman;

public class principal {
    
    int x = 0;
    
    public static void main(String[] args) {
        
        Cenario fase1 = new Cenario();
        Fantasma fant1 = new Fantasma("rosa", 10, false);
        Fantasma fant2 = new Fantasma("verde", 10, false);
        Fantasma fant3 = new Fantasma("azul", 10, false);
        Fantasma fant4 = new Fantasma("vermelho", 10, false);
        Pacman pacman = new Pacman(8, 3, false, false, 0);
        
        fase1.setAltura(20);
        fase1.setLargura(60);
        fase1.setQuantCerejas(1);
        fase1.setQuantParedes(20);
        fase1.setQuantEspeciais(4);
        fase1.setQuantPontos(1100);
        fase1.setFantasma1(fant1);
        fase1.setFantasma2(fant2);
        fase1.setFantasma3(fant3);
        fase1.setFantasma4(fant4);
        
        if(pacman.isEspecial() == true){
            for (int i = 0; i < 10; i++) { //Tempo de duração do especial
            fant1.setVuneravel(true);
            fant2.setVuneravel(true);
            fant3.setVuneravel(true);
            fant4.setVuneravel(true);
            fant1.setVelocidade(5);
            fant1.setVelocidade(5);
            fant1.setVelocidade(5);
            fant1.setVelocidade(5);
            }
        }
        
        if(pacman.isCapturado() == true){
            pacman.setTotalVidas(pacman.getTotalVidas()-1);
        }
        
        if(pacman.getTotalVidas() == 0){
            System.out.println("Game Over");
        }
        
        if(pacman.getPontosCapturados() == 1105){
            System.out.println("Venceu");
        }
        
    }
    
}
