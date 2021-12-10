
package com.disney.entidades;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import org.hibernate.annotations.GenericGenerator;

@Entity
public class Genero {
 
  
    
    
 @Id
@GeneratedValue(generator = "uuid")
@GenericGenerator(name = "uuid", strategy = "uuid2")     
 private String id;   
 private String nombre;
 private String imagen;

 
private List <Pelicula> pelicula; 

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public List<Pelicula> getPelicula() {
        return pelicula;
    }

    public void setPelicula(List<Pelicula> pelicula) {
        this.pelicula = pelicula;
    }

    
}
