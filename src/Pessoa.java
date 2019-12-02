/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author THALISSON
 */
public class Pessoa {
    private double peso;
    
    public Pessoa(double peso){
        this.setPeso(peso);
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    public void comer(Comida comida){
        this.peso += comida.getPeso();
    }
    
}
