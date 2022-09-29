package demoapp.controller;

import demoapp.service.SaludoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

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

    @RequestMapping("/numeroPar")
    public @ResponseBody String numeroPares(int numero){ return service.par(numero); }

    @PostMapping("/numeroPar")
    public String checkPersonInfo(@ModelAttribute @Valid UserData userData, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            return "formulario";
        }
        model.addAttribute("mensaje", service.par(userData.getX()));
        return "numero";
    }
}
