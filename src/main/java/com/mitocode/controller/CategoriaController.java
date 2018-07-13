
package com.mitocode.controller;

import com.mitocode.ejb.CategoriaFacadeLocal;
import com.mitocode.model.Categoria;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author ronald.arias
 */
@Named("categoriaBean")
@ViewScoped
public class CategoriaController implements Serializable {
    
    @Inject
    private CategoriaFacadeLocal categoriaEJB;
    
    private Categoria categoria;
    
    @PostConstruct
    public void init(){
        categoria = new Categoria();
    }
    
    public void registrar() {
        try {
            categoriaEJB.create(categoria);
        } catch (Exception e) {
            //mensaje prime growl
        }
    }

    public CategoriaFacadeLocal getCategoriaEJB() {
        return categoriaEJB;
    }

    public void setCategoriaEJB(CategoriaFacadeLocal categoriaEJB) {
        this.categoriaEJB = categoriaEJB;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
    
}
