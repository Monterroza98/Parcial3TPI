/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.uesocc.edu.ingenieria.tpi135_2018.mantto.boundaries;

import javax.ejb.EJB;
import javax.ws.rs.Path;
import sv.ues.TPI_2018.beans.AbstractInterface;
import sv.ues.TPI_2018.beans.ResponsableFacadeLocal;
import sv.ues.TPI_2018.entities.Responsable;

/**
 *
 * @author joker
 */
@Path("responsable")
public class ResponsableResource extends AbstractResource<Responsable> {
    
    @EJB
    private ResponsableFacadeLocal rfl;

    @Override
    protected AbstractInterface<Responsable> getFacade() {
        return rfl;
    }

    @Override
    protected Responsable crearNuevo() {
        return new Responsable();
    }
    
}
