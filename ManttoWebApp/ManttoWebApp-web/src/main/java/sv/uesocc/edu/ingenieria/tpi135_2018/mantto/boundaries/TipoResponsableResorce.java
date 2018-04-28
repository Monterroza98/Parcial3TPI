/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.uesocc.edu.ingenieria.tpi135_2018.mantto.boundaries;

import javax.ejb.EJB;
import javax.ws.rs.Path;
import sv.uesocc.edu.ingenieria.tpi135_2018.mantto.beans.AbstractInterface;
import sv.uesocc.edu.ingenieria.tpi135_2018.mantto.beans.TipoResponsableFacadeLocal;
import sv.uesocc.edu.ingenieria.tpi135_2018.mantto.entities.TipoResponsable;

/**
 *
 * @author joker
 */
@Path("tiporesponsable")
public class TipoResponsableResorce extends AbstractResource<TipoResponsable> implements FindByName<TipoResponsable>{
    
    @EJB
    private TipoResponsableFacadeLocal trfl;

    @Override
    protected AbstractInterface<TipoResponsable> getFacade() {
        return trfl;
    }

    @Override
    protected TipoResponsable crearNuevo() {
        return new TipoResponsable();
    }

    @Override
    public AbstractInterface<TipoResponsable> getFacadeName() {
        return trfl;
    }
    
    
}
