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
public class Cliente {
    private int IdCliente;
    private String Nombre;
    private String Telefono;

    public Cliente(int IdCliente, String Nombre, String Telefono) {
        this.IdCliente = IdCliente;
        this.Nombre = Nombre;
        this.Telefono = Telefono;
    }

    public int getIdCliente() {
        return IdCliente;
    }

    public void setIdCliente(int IdCliente) {
        this.IdCliente = IdCliente;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    @Override
    public String toString() {
        return "Cliente{" + "IdCliente=" + IdCliente + ", Nombre=" + Nombre + ", Telefono=" + Telefono + '}';
    }
    
}
