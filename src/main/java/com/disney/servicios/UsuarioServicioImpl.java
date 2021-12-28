/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.disney.servicios;


import com.disney.entidades.Usuario;
import org.springframework.stereotype.Service;

import org.springframework.beans.factory.annotation.Autowired;
import com.disney.repositorios.UsuarioRepositorio;
import com.disney.repositorios.BaseRepositorio;

@Service
public class UsuarioServicioImpl extends BaseServiceImpl <Usuario, Long> implements UsuarioServicio {
    
    
    @Autowired
    private UsuarioRepositorio usuarioRepositorio;
    
    
    public UsuarioServicioImpl (BaseRepositorio<Usuario, Long> baseRepositorio){
        
        super(baseRepositorio);
    }
}










   
