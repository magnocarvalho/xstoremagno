/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.xstoremagno.bean;

import br.edu.utfpr.xstoremagno.model.Compra;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;

/**
 *
 * @author magno
 */

public class CompraFacade extends AbstractFacade<Compra> {

    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
         if (em == null) {
            em = Persistence.createEntityManagerFactory(EMNames.EMN1, EMNames.getEMN1Props()).createEntityManager();
        }
        return em;
    }

    public CompraFacade() {
        super(Compra.class);
    }
    
}
