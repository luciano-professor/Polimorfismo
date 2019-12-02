/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author THALISSON
 */
public class TestarPolimorfismo {
    public static void main(String[] args) {
        try{
            Pessoa pessoa = new Pessoa(80.0);
            Arroz arroz = new Arroz(300);
            Feijao feijao = new Feijao(200);
            pessoa.comer(arroz);
            pessoa.comer(feijao);
            System.out.println(pessoa.getPeso());
            System.out.println(arroz);
        }catch(PesoInvalido p){
            System.out.println(p.getMessage());
         
        }
    }
}
