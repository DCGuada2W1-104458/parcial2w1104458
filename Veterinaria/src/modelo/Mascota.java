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
public class Mascota {
    private int IdMascota;
    private String Nombre;
    private Cliente cliente;
    private Especie IdEspecie;
    private int Nacimiento;

    public Mascota(int IdMascota, String Nombre, Cliente cliente, Especie IdEspecie, int Nacimiento) {
        this.IdMascota = IdMascota;
        this.Nombre = Nombre;
        this.cliente = cliente;
        this.IdEspecie = IdEspecie;
        this.Nacimiento = Nacimiento;
    }

    public Mascota(String Nombre, Cliente cliente, Especie IdEspecie, int Nacimiento) {
        this.Nombre = Nombre;
        this.cliente = cliente;
        this.IdEspecie = IdEspecie;
        this.Nacimiento = Nacimiento;
    }

    public int getIdMascota() {
        return IdMascota;
    }

    public void setIdMascota(int IdMascota) {
        this.IdMascota = IdMascota;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Especie getIdEspecie() {
        return IdEspecie;
    }

    public void setIdEspecie(Especie IdEspecie) {
        this.IdEspecie = IdEspecie;
    }

    public int getNacimiento() {
        return Nacimiento;
    }

    public void setNacimiento(int Nacimiento) {
        this.Nacimiento = Nacimiento;
    }

    @Override
    public String toString() {
        return "Mascota{" + "IdMascota=" + IdMascota + ", Nombre=" + Nombre + ", cliente=" + cliente + ", IdEspecie=" + IdEspecie + ", Nacimiento=" + Nacimiento + '}';
    }
    
    
}
