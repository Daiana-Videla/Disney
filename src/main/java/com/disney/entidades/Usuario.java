
package com.disney.entidades;


import com.disney.entidades.Base;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name= "Usuario")
public class Usuario extends Base {
   

  
  private  String nombre;
  private  String apellido;
  private  String mail;
  private  String clave;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }
  
 

   

    
}