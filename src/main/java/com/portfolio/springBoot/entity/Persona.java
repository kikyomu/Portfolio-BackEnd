
package com.portfolio.springBoot.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Grincode
 */
@Getter
@Setter
@Entity
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private int id;
    private String name;
    private String edad;
    private String ubicacion;
    private String imgPerfil;  
    private String titulo;
    private String descripcion;
    private String cv;
    private String password;
    private String usuario;
    private String imgBanner;
    private String titulo1;
    private String titulo2;
    private String titulo3;

    public Persona() {
    }

    public Persona(String name, String edad, String ubicacion, String imgPerfil, String titulo, String descripcion, String cv, String imgBanner, String titulo1, String titulo2, String titulo3) {
        this.name = name;
        this.edad = edad;
        this.ubicacion = ubicacion;
        this.imgPerfil = imgPerfil;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.cv = cv;
        this.imgBanner = imgBanner;
        this.titulo1 = titulo1;
        this.titulo2 = titulo2;
        this.titulo3 = titulo3;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }
    
    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
    
    public String getImgPerfil() {
        return imgPerfil;
    }

    public void setImgPerfil(String imgPerfil) {
        this.imgPerfil = imgPerfil;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCv() {
        return cv;
    }

    public void setCv(String cv) {
        this.cv = cv;
    }
    
    public String getImgBanner() {
        return imgBanner;
    }

    public void setImgBanner(String imgBanner) {
        this.imgBanner = imgBanner;
    }

    public String getTitulo1() {
        return titulo1;
    }

    public void setTitulo1(String titulo1) {
        this.titulo1 = titulo1;
    }

    public void setTitulo2(String titulo2) {
        this.titulo2 = titulo2;
    }
    
    public String getTitulo3() {
        return titulo3;
    }

    public void setTitulo3(String titulo3) {
        this.titulo3 = titulo3;
    }
    
    
    
}
