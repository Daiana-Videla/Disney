/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.disney.repositorios;

import com.disney.entidades.Personaje;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonajeRepositorio extends JpaRepository <Personaje, String>{
    
    
    @Query ("SELECT c.nombre, c.imagen FROM Personaje c")
    public List <String> listarPorNombreYFoto ();
    
    
    @Query ("SELECT c FROM Personaje WHERE c.nombre= :nombre")
    public List <Personaje> listarTodo(@Param("nombre") String nombre);
    
    
    @Query ("SELECT c FROM Personaje c WHERE c.edad = :edad")
    public List <Personaje> buscarPorEdad (@Param("edad") int edad);
    
    @Query ( value = "SELECT * FROM Personaje WHERE pelicula.id = :id", nativeQuery = true)            
    public List <Personaje> buscarPorPelicula (@Param("id") String id);
}
