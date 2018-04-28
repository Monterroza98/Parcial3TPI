/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.uesocc.edu.ingenieria.tpi135_2018.mantto.boundaries;

import java.io.Serializable;
import javax.ejb.EJB;
import javax.ws.rs.Path;
import sv.ues.TPI_2018.beans.AbstractInterface;
import sv.ues.TPI_2018.beans.ParteFacadeLocal;
import sv.ues.TPI_2018.entities.Parte;

/**
 *
 * @author joker
 */
@Path("parte")
public class ParteResource extends AbstractResource<Parte> implements FindByName<Parte>{
    
    @EJB
    private ParteFacadeLocal pfl;

    @Override
    protected AbstractInterface<Parte> getFacade() {
        return pfl;
    }

    @Override
    protected Parte crearNuevo() {
        return new Parte();
    }

    @Override
    public AbstractInterface<Parte> getFacadeName() {
        return pfl;
    }
   
    
}
