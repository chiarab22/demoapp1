package demoapp.service;

import org.springframework.stereotype.Service;

@Service
public class SaludoService {
    public String saluda(String nombre) {
        return "Hola " + nombre;
    }

    public String año(int año) {
        return "Tienes " + (2022 - año) + " años";
    }
        
    
}