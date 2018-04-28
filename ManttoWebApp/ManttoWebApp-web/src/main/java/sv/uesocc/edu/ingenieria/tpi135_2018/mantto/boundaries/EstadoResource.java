/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.uesocc.edu.ingenieria.tpi135_2018.mantto.boundaries;

import javax.ejb.EJB;
import javax.ws.rs.Path;
import sv.ues.TPI_2018.beans.AbstractInterface;
import sv.ues.TPI_2018.beans.EstadoFacadeLocal;
import sv.ues.TPI_2018.entities.Estado;

/**
 *
 * @author joker
 */
@Path("estado")
public class EstadoResource extends AbstractResource<Estado> implements FindByName<Estado>{
    
    @EJB
    private EstadoFacadeLocal efl;

    @Override
    protected AbstractInterface<Estado> getFacade() {
        return efl;
    }    

    @Override
    protected Estado crearNuevo() {
        return new Estado();
    }

    @Override
    public AbstractInterface<Estado> getFacadeName() {
        return efl;
    }


}
