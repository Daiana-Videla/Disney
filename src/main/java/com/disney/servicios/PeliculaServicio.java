/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.disney.servicios;

import com.disney.Excepciones.ExcepcionesServicio;
import com.disney.entidades.Pelicula;
import com.disney.repositorios.PeliculaRepositorio;
import com.disney.repositorios.PersonajeRepositorio;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PeliculaServicio {
    
    
   @Autowired 
   private PeliculaRepositorio pelicularepositorio;
   
   @Autowired 
   private PersonajeRepositorio personajerepositorio;
   

   private PersonajeServicio personajeservicio;
   
   private GeneroServicio generoservicio;
   
   
   public void crearPelicula (String titulo, Date fechadecreación, Integer calificacion, String genero ){
       
       Pelicula pelicula = new Pelicula();
       pelicula.setTitulo(titulo);
       pelicula.setFechadecreación(fechadecreación);
       pelicula.setCalificacion(Integer.MIN_VALUE);
      
     //  pelicula.setPersonajes(personajeservicio.crearPersonajes(nombre));
     //  pelicula.setGenero(generoservicio.ingresarGenero(titulo));
       
       
       pelicularepositorio.save(pelicula);
   }
   
   

   public void modificarPelicula (String titulo, Date fechadecreación, Integer calificacion, String personajes, String genero) throws ExcepcionesServicio{
       
       validar (titulo, fechadecreación ,calificacion,personajes,genero);
       
       Pelicula pelicula = new Pelicula();
       pelicula.setTitulo(titulo);
       pelicula.setFechadecreación(fechadecreación);
       pelicula.setCalificacion(Integer.MIN_VALUE);
   //    pelicula.setPersonajes(personajeservicio.crearPersonaje(titulo));
     //  pelicula.setGenero(generoservicio.ingresarGenero(titulo));
       
       
       pelicularepositorio.save(pelicula);
       
       
   }
   
  
      
        
private void validar (String titulo, Date fechadecreación, Integer calificacion, String personajes, String genero) throws ExcepcionesServicio{
        if (titulo == null) {
            throw new ExcepcionesServicio("El titulo no puede estar vacio");
        }
        if (fechadecreación == null) {
            throw new ExcepcionesServicio("Debe ingresar un una fecha correcta");
        }
         if (calificacion == null || calificacion >=1 & calificacion<=5) {
            throw new ExcepcionesServicio("Debe ingresar una calificacion correcta ");
        }
        
        if (personajes == null) {
            throw new ExcepcionesServicio("El personaje no puede estar vacio");
        }
        if (genero == null) {
            throw new ExcepcionesServicio("El genero no puede estar vacio");
        }
}




   
         

   
   
   
   
   
   
   
}
