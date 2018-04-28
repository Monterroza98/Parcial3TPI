/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.uesocc.edu.ingenieria.tpi135_2018.mantto.boundaries;

import javax.ejb.EJB;
import javax.ws.rs.Path;
import sv.ues.TPI_2018.beans.AbstractInterface;
import sv.ues.TPI_2018.beans.SubTipoMantenimientoFacadeLocal;
import sv.ues.TPI_2018.entities.SubTipoMantenimiento;

/**
 *
 * @author joker
 */
@Path("subtipomantenimiento")
public class SubTipoMantenimientoResource extends AbstractResource<SubTipoMantenimiento> implements FindByName<SubTipoMantenimiento>{
    
    @EJB
    private SubTipoMantenimientoFacadeLocal stmfl;

    @Override
    protected AbstractInterface<SubTipoMantenimiento> getFacade() {
        return stmfl;
    }

    @Override
    protected SubTipoMantenimiento crearNuevo() {
        return new SubTipoMantenimiento();
    }

    @Override
    public AbstractInterface<SubTipoMantenimiento> getFacadeName() {
        return stmfl;
    }
    
    
}
