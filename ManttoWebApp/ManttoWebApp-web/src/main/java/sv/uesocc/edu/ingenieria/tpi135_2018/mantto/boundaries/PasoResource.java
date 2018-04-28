/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.uesocc.edu.ingenieria.tpi135_2018.mantto.boundaries;

import javax.ejb.EJB;
import javax.ws.rs.Path;
import sv.uesocc.edu.ingenieria.tpi135_2018.mantto.beans.AbstractInterface;
import sv.uesocc.edu.ingenieria.tpi135_2018.mantto.beans.PasoFacadeLocal;
import sv.uesocc.edu.ingenieria.tpi135_2018.mantto.entities.Paso;

/**
 *
 * @author joker
 */
@Path("paso")
public class PasoResource extends AbstractResource<Paso> implements FindByName<Paso>{
    
    @EJB
    private PasoFacadeLocal pfl;

    @Override
    protected AbstractInterface<Paso> getFacade() {
        return pfl;
    }

    @Override
    protected Paso crearNuevo() {
        return new Paso();
    }

    @Override
    public AbstractInterface<Paso> getFacadeName() {
        return pfl;
    }
    
    
}
