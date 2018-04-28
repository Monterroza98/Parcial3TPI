/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.uesocc.edu.ingenieria.tpi135_2018.mantto.beans;

import java.util.List;
import javax.ejb.Local;
import sv.uesocc.edu.ingenieria.tpi135_2018.mantto.entities.SubTipoMantenimiento;

/**
 *
 * @author joker
 */
@Local
public interface SubTipoMantenimientoFacadeLocal {

    void create(SubTipoMantenimiento subTipoMantenimiento);

    void edit(SubTipoMantenimiento subTipoMantenimiento);

    void remove(SubTipoMantenimiento subTipoMantenimiento);

    SubTipoMantenimiento find(Object id);

    List<SubTipoMantenimiento> findAll();

    List<SubTipoMantenimiento> findRange(int[] range);

    int count();
    
}
