/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Usuario
 */
public class Especie {
    private int IdEspecie;
    private String Denominacion;

    public Especie(int IdEspecie, String Denominacion) {
        this.IdEspecie = IdEspecie;
        this.Denominacion = Denominacion;
    }

    public int getIdEspecie() {
        return IdEspecie;
    }

    public void setIdEspecie(int IdEspecie) {
        this.IdEspecie = IdEspecie;
    }

    public String getDenominacion() {
        return Denominacion;
    }

    public void setDenominacion(String Denominacion) {
        this.Denominacion = Denominacion;
    }

    @Override
    public String toString() {
        return "Especie{" + "IdEspecie=" + IdEspecie + ", Denominacion=" + Denominacion + '}';
    }
    
}
