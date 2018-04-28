/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.uesocc.edu.ingenieria.tpi135_2018.mantto.boundaries;

import javax.ejb.EJB;
import javax.ws.rs.Path;
import sv.uesocc.edu.ingenieria.tpi135_2018.mantto.beans.AbstractInterface;
import sv.uesocc.edu.ingenieria.tpi135_2018.mantto.beans.SolicitudFacadeLocal;
import sv.uesocc.edu.ingenieria.tpi135_2018.mantto.entities.Solicitud;

/**
 *
 * @author joker
 */
@Path("solicitud")
public class SolicitudResource extends AbstractResource<Solicitud>{
    
    @EJB
    private SolicitudFacadeLocal sfl;

    @Override
    protected AbstractInterface<Solicitud> getFacade() {
        return sfl;
    }

    @Override
    protected Solicitud crearNuevo() {
        return new Solicitud();
    }
    
    
}
