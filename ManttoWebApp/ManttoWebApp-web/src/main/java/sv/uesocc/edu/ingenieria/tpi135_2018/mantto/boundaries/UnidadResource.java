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
import sv.ues.TPI_2018.beans.UnidadFacadeLocal;
import sv.ues.TPI_2018.entities.Unidad;

/**
 *
 * @author joker
 * 
 */
@Path("unidad")
public class UnidadResource  extends AbstractResource<Unidad> implements FindByName<Unidad>{
    
    @EJB
    private UnidadFacadeLocal ufl;

    @Override
    protected AbstractInterface<Unidad> getFacade() {
        return ufl;
    }

    @Override
    protected Unidad crearNuevo() {
        return new Unidad();
    }

    @Override
    public AbstractInterface<Unidad> getFacadeName() {
        return ufl;
    }
    

}