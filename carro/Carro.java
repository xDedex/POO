/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carro;

import veiculo.Veiculo;

/**
 *
 * @author LABORATORIO 01
 */
public class Carro extends Veiculo{
    private String porta;
    private String parabrisa;
    private String volante;

    /**
     * @return the porta
     */
    public String getPorta() {
        return porta;
    }

    /**
     * @param porta the porta to set
     */
    public void setPorta(String porta) {
        this.porta = porta;
    }

    /**
     * @return the parabrisa
     */
    public String getParabrisa() {
        return parabrisa;
    }

    /**
     * @param parabrisa the parabrisa to set
     */
    public void setParabrisa(String parabrisa) {
        this.parabrisa = parabrisa;
    }

    /**
     * @return the volante
     */
    public String getVolante() {
        return volante;
    }

    /**
     * @param volante the volante to set
     */
    public void setVolante(String volante) {
        this.volante = volante;
    }
    
}
