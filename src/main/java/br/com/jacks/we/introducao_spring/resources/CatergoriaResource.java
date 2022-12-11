package br.com.jacks.we.introducao_spring.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/categorias")
public class CatergoriaResource {

    //@RequestMapping(method=RequestMethod.GET)
    @GetMapping
    public String listar(){
        return "Rest esta funcionando";
    }
}
