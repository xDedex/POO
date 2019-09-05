/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moto;

import veiculo.Veiculo;

/**
 *
 * @author LABORATORIO 01
 */
public class Moto extends Veiculo {
    private String guidao;
    private String macaco;
    private String manete;

    /**
     * @return the guidao
     */
    public String getGuidao() {
        return guidao;
    }

    /**
     * @param guidao the guidao to set
     */
    public void setGuidao(String guidao) {
        this.guidao = guidao;
    }

    /**
     * @return the macaco
     */
    public String getMacaco() {
        return macaco;
    }

    /**
     * @param macaco the macaco to set
     */
    public void setMacaco(String macaco) {
        this.macaco = macaco;
    }

    /**
     * @return the manete
     */
    public String getManete() {
        return manete;
    }

    /**
     * @param manete the manete to set
     */
    public void setManete(String manete) {
        this.manete = manete;
    }
    
}
