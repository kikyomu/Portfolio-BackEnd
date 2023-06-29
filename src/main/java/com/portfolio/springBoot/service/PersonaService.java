
package com.portfolio.springBoot.service;

import com.portfolio.springBoot.entity.Persona;
import com.portfolio.springBoot.repository.PersonaRepository;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class PersonaService {

    @Autowired
    public PersonaRepository personaRepository;
    
    public List <Persona> verPersonas(){
        List <Persona> listaPersonas= personaRepository.findAll();
        return listaPersonas;
     }
     
    public Persona buscarPersona(int id){
        Persona perso = personaRepository.findById(id).orElse(null);
        return perso;
     }
     
    public Optional<Persona> getByName(String name){
        return personaRepository.findByName(name);
    }
     
    public void crearPersona(Persona persona){
        personaRepository.save(persona);
    }
    
    public void editarPersona(Persona persona){
        personaRepository.save(persona);
    }
     
    public void borrarPersona(int id){
        personaRepository.deleteById(id);
    }
     
    public boolean existsById(int id){
        return personaRepository.existsById(id);
    }
     
    public boolean existsByName(String name){
        return personaRepository.existsByName(name);
    }

    public void crearPersona(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    

}
