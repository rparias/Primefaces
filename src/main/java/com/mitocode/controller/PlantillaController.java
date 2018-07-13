/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mitocode.controller;

import com.mitocode.model.Usuario;
import java.io.Serializable;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

/**
 *
 * @author ronald.arias
 */
@Named("plantillaBean")
@ViewScoped
public class PlantillaController implements Serializable{
    
    public void verificarSesion(){
        try {
            FacesContext context = FacesContext.getCurrentInstance();
            
            Usuario user = (Usuario) context.getExternalContext().getSessionMap().get("usuario");
            
            if(user == null){
                context.getExternalContext().redirect("./../permisos.xhtml");
            }
        } catch (Exception e) {
            //log para guardar algun registro de error
        }
    }
    
    public void cerrarSesion() {
        FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
    }
    
}
