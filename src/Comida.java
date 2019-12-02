/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author THALISSON
 */
public class Comida {
    private double peso;
    
    public Comida(double peso) throws PesoInvalido{
        this.setPeso(peso);
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) throws PesoInvalido{
        if(peso < 0){
            throw new PesoInvalido("Valor Invalido");
        }
        double gramasParaKg = peso/1000;
        this.peso = gramasParaKg;
    }
    
    
}
