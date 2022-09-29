package demoapp.controller;

import demoapp.service.SaludoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ParController {
    @Autowired
    private SaludoService service;
    @GetMapping("/numeroPar")
    // Hay que declarar un parámetro con el tipo usado en el modelo del formulario (UserData)
    public String numero(UserData userData) {
        return "formulario";
    }

  @RequestMapping("/numeroPar/{x}")
    public @ResponseBody String numeroPar(@PathVariable (value = "x") int numero){
      return service.par(numero);
    }

}
