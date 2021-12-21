/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.disney.servicios;

import com.disney.Excepciones.ExcepcionesServicio;
import java.util.List;


public interface BaseService <D> {
    public List<D> findAll() throws ExcepcionesServicio;
    public D findById(String id) throws  ExcepcionesServicio;
    public D save(D entity)throws  ExcepcionesServicio;
    public D update (String id, D entity )throws  ExcepcionesServicio;
    public boolean delete (String id)throws  ExcepcionesServicio;
}

