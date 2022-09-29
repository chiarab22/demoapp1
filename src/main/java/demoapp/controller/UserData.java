package demoapp.controller;

import javax.validation.constraints.Size;

public class UserData {
    @Size(min=3, max=30)
    String nombre;
    int x;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}
