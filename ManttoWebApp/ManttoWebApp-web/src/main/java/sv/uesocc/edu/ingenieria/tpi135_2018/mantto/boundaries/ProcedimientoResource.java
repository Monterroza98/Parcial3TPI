/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.uesocc.edu.ingenieria.tpi135_2018.mantto.boundaries;

import javax.ejb.EJB;
import javax.ws.rs.Path;
import sv.uesocc.edu.ingenieria.tpi135_2018.mantto.beans.AbstractInterface;
import sv.uesocc.edu.ingenieria.tpi135_2018.mantto.beans.ProcedimientoFacadeLocal;
import sv.uesocc.edu.ingenieria.tpi135_2018.mantto.entities.Procedimiento;

/**
 *
 * @author joker
 */
@Path("procedimiento")
public class ProcedimientoResource extends AbstractResource<Procedimiento> implements FindByName<Procedimiento>{
    
    @EJB
    private ProcedimientoFacadeLocal pfl;

    @Override
    protected AbstractInterface<Procedimiento> getFacade() {
        return pfl;
    }

    @Override
    protected Procedimiento crearNuevo() {
        return new Procedimiento();
    }

    @Override
    public AbstractInterface<Procedimiento> getFacadeName() {
        return pfl;
    }
    
    
}
