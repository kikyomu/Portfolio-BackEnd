
package com.portfolio.springBoot.controller;

import com.portfolio.springBoot.entity.Persona;
import com.portfolio.springBoot.service.PersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("persona")
@CrossOrigin(origins = "http://localhost:4200")
public class PersonaController {
    @Autowired
    PersonaService service;

   @PostMapping("/lista")
   public List <Persona> verPersonas() {
      return service.verPersonas();
   }

   @PostMapping("/editar")
   public void editarPersona(@RequestBody Persona persona) {
      service.editarPersona(persona);

   }
   
   @PostMapping("/buscar")
   public Persona buscarPersona(@RequestBody int id) {
      return service.buscarPersona(id);

   }
   
   @PostMapping("/borrar")
   public void borrarPersona(@RequestBody int id) {
       service.borrarPersona(id);

   }
   
   @PostMapping("/crear")
   public String crearPersona(@RequestBody int id) {
       service.crearPersona(id);
       return "La persona fue creada con éxito";

   }
    
}
