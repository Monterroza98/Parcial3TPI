/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.uesocc.edu.ingenieria.tpi135_2018.mantto.boundaries;

import javax.ejb.EJB;
import javax.ws.rs.Path;
import sv.ues.TPI_2018.beans.AbstractInterface;
import sv.ues.TPI_2018.beans.TipoParteFacadeLocal;
import sv.ues.TPI_2018.entities.TipoParte;

/**
 *
 * @author joker
 */
@Path("tipoparte")
public class TipoParteResource extends AbstractResource<TipoParte> implements FindByName<TipoParte>{
    
    @EJB
    private TipoParteFacadeLocal tpfl;

    @Override
    protected AbstractInterface<TipoParte> getFacade() {
        return tpfl;
    }

    @Override
    protected TipoParte crearNuevo() {
        return new TipoParte();
    }

    @Override
    public AbstractInterface<TipoParte> getFacadeName() {
        return tpfl;
    }
    
    
}
