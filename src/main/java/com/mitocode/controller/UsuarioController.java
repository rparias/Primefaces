/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mitocode.controller;

import com.mitocode.ejb.UsuarioFacadeLocal;
import com.mitocode.model.Persona;
import com.mitocode.model.Usuario;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author ronald.arias
 */
@Named("usuarioBean")
@ViewScoped
public class UsuarioController implements Serializable {
    
    @Inject
    private UsuarioFacadeLocal usuarioEJB;
    
    private Usuario usuario;
    private Persona persona;
    
    @PostConstruct
    public void init(){
        usuario = new Usuario();
        persona = new Persona();
    }
    
    public void registrar() {
        try {
            this.usuario.setCodigo(persona);
            usuarioEJB.create(usuario);
            
            //mensaje
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Aviso", "Se registró correctamente"));
        } catch (Exception e) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_FATAL, "Aviso", "Error"));
        }
    }
    
    public Usuario iniciarSesion() {
        
        Usuario usuario = null;
        try {
            
        } catch (Exception e) {
            throw e;
        } finally {
            
        }
        
        return usuario;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }
    
}
