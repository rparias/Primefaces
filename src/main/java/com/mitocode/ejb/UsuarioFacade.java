/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mitocode.ejb;

import com.mitocode.model.Usuario;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author ronald.arias
 */
@Stateless
public class UsuarioFacade extends AbstractFacade<Usuario> implements UsuarioFacadeLocal {

    @PersistenceContext(unitName = "primePU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public UsuarioFacade() {
        super(Usuario.class);
    }

    @Override
    public Usuario iniciarSesion(Usuario usuario) {
        String consulta = "FROM Usuario u WHERE u.usuario = ?1 and u.clave = ?2";
        Query query = em.createQuery(consulta);
        query.setParameter(1, usuario.getUsuario());
        query.setParameter(2, usuario.getClave());
        
        List<Usuario> usuarios = query.getResultList();
        
        if (!usuarios.isEmpty()) {
            usuario = usuarios.get(0);
        } else {
            usuario = null;
        }
        
        return usuario;
    }
    
}
