/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.uesocc.edu.ingenieria.tpi135_2018.mantto.boundaries;

import javax.ejb.EJB;
import javax.ws.rs.Path;
import sv.uesocc.edu.ingenieria.tpi135_2018.mantto.beans.AbstractInterface;
import sv.uesocc.edu.ingenieria.tpi135_2018.mantto.beans.MarcaFacadeLocal;
import sv.uesocc.edu.ingenieria.tpi135_2018.mantto.entities.Marca;

/**
 *
 * @author joker
 */
@Path("marca")
public class MarcaResource extends AbstractResource<Marca> implements FindByName<Marca>{

    @EJB
    private MarcaFacadeLocal mfl;

    @Override
    protected AbstractInterface<Marca> getFacade() {
        return mfl;
    }

    @Override
    protected Marca crearNuevo() {
        return new Marca();
    }

    @Override
    public AbstractInterface<Marca> getFacadeName() {
        return mfl;
    }


}
    
