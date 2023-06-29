
package com.portfolio.springBoot.repository;

import com.portfolio.springBoot.entity.Persona;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends JpaRepository<Persona, Integer> {

    public Optional<Persona> findByNombre(String nombre);

    public boolean existsByNombre(String nombre);

    public boolean existsByName(String name);

    public Optional<Persona> findByName(String name);

}