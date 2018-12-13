/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.xstoremagno.bean;

import br.edu.utfpr.xstoremagno.model.Itemcompra;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author magno
 */
@Stateless
public class ItemcompraFacade extends AbstractFacade<Itemcompra> {

    @PersistenceContext(unitName = "br.edu.utfpr_xstoremagno_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ItemcompraFacade() {
        super(Itemcompra.class);
    }
    
}