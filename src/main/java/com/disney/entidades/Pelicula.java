
package com.disney.entidades;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import org.hibernate.annotations.GenericGenerator;

@Entity
public class Pelicula {
    

@Id
@GeneratedValue(generator = "uuid")
@GenericGenerator(name = "uuid", strategy = "uuid2")        
private String id;    

private  String  imagen;
private  String titulo;
private Date fechadecreación;
private Integer calificacion; //(del 1 al 5).

@OneToMany
private Personaje personajes;
@OneToMany
private Genero genero;

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Date getFechadecreación() {
        return fechadecreación;
    }

    public void setFechadecreación(Date fechadecreación) {
        this.fechadecreación = fechadecreación;
    }

    public Integer getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(Integer calificacion) {
        this.calificacion = calificacion;
    }

    public Personaje getPersonajes() {
        return personajes;
    }

    public void setPersonajes(Personaje personajes) {
        this.personajes = personajes;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }



}
