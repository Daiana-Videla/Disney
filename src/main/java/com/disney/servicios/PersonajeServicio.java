
package com.disney.servicios;

import com.disney.Excepciones.ExcepcionesServicio;
import com.disney.entidades.Personaje;
import com.disney.repositorios.PersonajeRepositorio;
import java.util.List;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class PersonajeServicio implements BaseService<Personaje> {
    
    
  @Autowired  
   private PersonajeRepositorio personajeRepositorio;
  
   
    
        
        
    

    
    
    
    
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

    @Override
    @Transactional
    public List<Personaje> findAll() throws ExcepcionesServicio {
        try {
            List<Personaje> entities = personajeRepositorio.findAll();
            return entities;
        } catch (Exception e) {
            throw new ExcepcionesServicio(e.getMessage());
        }

    }

    @Override
    @Transactional
    public Personaje findById(String id) throws ExcepcionesServicio {
        try {
            Optional<Personaje> entitiOpcional = personajeRepositorio.findById(id);
            return entitiOpcional.get();
        } catch (Exception e) {
            throw new ExcepcionesServicio(e.getMessage());
        }
    }


    @Override
    @Transactional
    public Personaje save(Personaje entity) throws ExcepcionesServicio {
        try {
            entity = personajeRepositorio.save(entity);
            return entity;
        } catch (Exception e) {
            throw new ExcepcionesServicio(e.getMessage());
        }
    }

    @Override
    @Transactional
    public Personaje update(String id, Personaje entity) throws ExcepcionesServicio {
        Optional<Personaje> entityOptional = personajeRepositorio.findById(id);
        Personaje personaje = entityOptional.get();
        personaje = personajeRepositorio.save(entity);
        return personaje;
    }

        @Override
        @Transactional
        public boolean delete(String id) throws ExcepcionesServicio {
        try {
			if(personajeRepositorio.existsById(id)) {
				personajeRepositorio.deleteById(id);
				return true;
			}else {
				throw new Exception();
			}
		} catch (Exception e) {
			throw new ExcepcionesServicio(e.getMessage());
		}

       
    
    
    }
}
