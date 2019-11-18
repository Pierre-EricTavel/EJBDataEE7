/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itta.cours.ejbdata;

import itta.cours.data.DiscountCode;
import javax.ejb.Stateful;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Administrator
 */
 
@Stateless
public class DiscountCodeFacade extends AbstractFacade<DiscountCode> implements DiscountCodeFacadeLocal {

    @PersistenceContext(unitName = "EJBDataPerrinPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public DiscountCodeFacade() {
        super(DiscountCode.class);
    }
    
}
