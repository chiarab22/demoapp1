package demoapp.service;

import org.springframework.stereotype.Service;

@Service
public class SaludoService {
    public String saluda(String nombre) {
        return "Hola " + nombre;
    }

    public String par(int x){
        if(x%2==0){
            return String.format("El número %d es par", x);
        }
        return String.format("El número %d es impar", x);
    }
    
}