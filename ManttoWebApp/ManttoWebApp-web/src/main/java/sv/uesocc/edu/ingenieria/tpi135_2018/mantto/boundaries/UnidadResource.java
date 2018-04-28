/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.uesocc.edu.ingenieria.tpi135_2018.mantto.boundaries;

import javax.ejb.EJB;
import javax.ws.rs.Path;
import sv.uesocc.edu.ingenieria.tpi135_2018.mantto.beans.AbstractInterface;
import sv.uesocc.edu.ingenieria.tpi135_2018.mantto.beans.UnidadFacadeLocal;
import sv.uesocc.edu.ingenieria.tpi135_2018.mantto.entities.Unidad;

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