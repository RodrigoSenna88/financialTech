package financialtech.controllers;

import financialtech.entities.Lojista;
import financialtech.services.LojistaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/lojista")
public class LojistaController {

    @Autowired
    private LojistaService lojistaService;

    @PostMapping("/create")
    public Lojista createLojista(@RequestBody Lojista lojista) {
        return lojistaService.createLojista(lojista);
    }
}
