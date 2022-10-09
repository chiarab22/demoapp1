package demoapp.controller;

import javax.validation.constraints.Size;

public class UserData {
    @Size(min=1, max=30)
    String nombre;
    int numero;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumero() {return numero;}

    public void setNumero(int x) {this.numero = numero;}
}
