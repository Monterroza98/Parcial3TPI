/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.uesocc.edu.ingenieria.tpi135_2018.mantto.beans;

import java.util.List;
import javax.ejb.Local;
import sv.uesocc.edu.ingenieria.tpi135_2018.mantto.entities.TipoResponsable;

/**
 *
 * @author joker
 */
@Local
public interface TipoResponsableFacadeLocal {

    void create(TipoResponsable tipoResponsable);

    void edit(TipoResponsable tipoResponsable);

    void remove(TipoResponsable tipoResponsable);

    TipoResponsable find(Object id);

    List<TipoResponsable> findAll();

    List<TipoResponsable> findRange(int[] range);

    int count();
    
}
