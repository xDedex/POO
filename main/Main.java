/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import carro.Carro;
import moto.Moto;
import veiculo.Veiculo;

/**
 *
 * @author LABORATORIO 01
 */
public class Main {
    
    public static void acelerar(Veiculo veiculo){
        if(veiculo instanceof Moto){
            ((Moto) veiculo).empinar();
        }else if(veiculo instanceof Carro){
            ((Carro) veiculo).drift();
        }
    }
    
    public static void main(String[] args){
        Moto moto = new Moto();
        Carro carro = new Carro();
        
        moto.setCor("Preto");
        carro.setCor("Azul");
        
        moto.setManete("Azul com led");
        carro.setVolante("Revestido em couro");

        System.out.println(moto.getCor());
        System.out.println(carro.getCor());
        System.out.println(moto.getManete());
        System.out.println(carro.getVolante());
        
        
        acelerar(carro);
        acelerar(moto);
    } 
   
}
