/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entitypack;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author shelc
 */
@javax.ejb.Stateless
public class BookAuthFacade extends AbstractFacade<BookAuth> implements BookAuthFacadeLocal {

    @PersistenceContext(unitName = "EntityExamplePU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public BookAuthFacade() {
        super(BookAuth.class);
    }
    
}
