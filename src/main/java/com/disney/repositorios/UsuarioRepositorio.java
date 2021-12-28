/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.disney.repositorios;

import com.disney.entidades.Usuario;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepositorio extends BaseRepositorio <Usuario, Long> {
    
}
