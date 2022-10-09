package demoapp.service;


import org.springframework.stereotype.Service;

@Service
public class ParService {
    public String par(int numero){
        if(numero%2==0){
            return String.format("El número %d es par", numero);
        }
        return String.format("El número %d es impar", numero);
    }

}
