/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.uesocc.edu.ingenieria.tpi135_2018.mantto.beans;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import sv.uesocc.edu.ingenieria.tpi135_2018.mantto.entities.Calendario;

/**
 *
 * @author joker
 */
@Stateless
public class CalendarioFacade extends AbstractFacade<Calendario> implements CalendarioFacadeLocal {

    @PersistenceContext(unitName = "sv.uesocc.edu.ingenieria.tpi135_2018.mantto_ManttoWebApp-ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CalendarioFacade() {
        super(Calendario.class);
    }
    
}
