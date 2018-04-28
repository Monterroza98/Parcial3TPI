/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.uesocc.edu.ingenieria.tpi135_2018.mantto.boundaries;

import javax.ejb.EJB;
import javax.ws.rs.Path;
import sv.uesocc.edu.ingenieria.tpi135_2018.mantto.beans.AbstractInterface;
import sv.uesocc.edu.ingenieria.tpi135_2018.mantto.beans.TipoMantenimientoFacadeLocal;
import sv.uesocc.edu.ingenieria.tpi135_2018.mantto.entities.TipoMantenimiento;

/**
 *
 * @author joker
 */
@Path("tipomantenimiento")
public class TipoMantenimientoResource extends AbstractResource<TipoMantenimiento> implements FindByName<TipoMantenimiento>{
    
    @EJB
    private TipoMantenimientoFacadeLocal tmfl;

    @Override
    protected AbstractInterface<TipoMantenimiento> getFacade() {
        return tmfl;
    }

    @Override
    protected TipoMantenimiento crearNuevo() {
        return new TipoMantenimiento();
    }

    @Override
    public AbstractInterface<TipoMantenimiento> getFacadeName() {
        return tmfl;
    }
    
 
}
