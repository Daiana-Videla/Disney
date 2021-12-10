
package com.disney.servicios;

import com.disney.entidades.Personaje;
import com.disney.repositorios.PersonajeRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonajeServicio {
    
  @Autowired  
   private PersonajeRepositorio personajerepositorio;
  
   
    public Personaje crearPersonaje (String nombre){
        
      Personaje personaje= new Personaje ();
        
      personaje.setNombre(nombre);
      personaje.setEdad(Integer.SIZE);
      personaje.setPeso(Integer.SIZE);
      personaje.setHistoria(nombre);
    //como agrego las peliculas
        
    return personajerepositorio.save(personaje);
     
     
    }
    
    
    
    public Personaje modificarPersonaje (String nombre) {
          Personaje personaje= new Personaje ();
        
      personaje.setNombre(nombre);
      personaje.setEdad(Integer.SIZE);
      personaje.setPeso(Integer.SIZE);
      personaje.setHistoria(nombre);
    
        
    return personajerepositorio.save(personaje);
     
        
        
    }

    
    
    
    
//     public void ingresarLibro (Integer isbn, String titulo,Integer anio, Integer ejemplares, 
//            boolean alta, String autor, String editorial) throws ExcepcionesServicio{
//        
//        
//        
//        validar ( isbn,  titulo, anio,  ejemplares, alta,  autor,  editorial);
//        
//    
//        
//        Libro libro= new Libro ();
//        libro.setIsbn(isbn);
//        libro.setTitulo(titulo);
//        libro.setAnio(anio);
//        libro.setEjemplares(ejemplares);
//        libro.setAlta(true);
//        libro.setAutor(crearAutor(autor));
//        libro.setEditorial(crearEditorial(editorial));
//        
//        libroRepositorio.save(libro);
//       
//        
//    }
    
}
