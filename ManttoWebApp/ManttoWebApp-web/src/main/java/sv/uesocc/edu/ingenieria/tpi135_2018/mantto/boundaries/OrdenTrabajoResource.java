/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.uesocc.edu.ingenieria.tpi135_2018.mantto.boundaries;

import javax.ejb.EJB;
import javax.ws.rs.Path;
import sv.uesocc.edu.ingenieria.tpi135_2018.mantto.beans.AbstractInterface;
import sv.uesocc.edu.ingenieria.tpi135_2018.mantto.beans.OrdenTrabajoFacadeLocal;
import sv.uesocc.edu.ingenieria.tpi135_2018.mantto.entities.OrdenTrabajo;

/**
 *
 * @author joker
 */
@Path("ordentrabajo")
public class OrdenTrabajoResource extends AbstractResource<OrdenTrabajo>{
    
    @EJB
    private OrdenTrabajoFacadeLocal otfl;

    @Override
    protected AbstractInterface<OrdenTrabajo> getFacade() {
        return otfl;
    }

    @Override
    protected OrdenTrabajo crearNuevo() {
        return new OrdenTrabajo();
    }
    
    
}
