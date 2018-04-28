/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.uesocc.edu.ingenieria.tpi135_2018.mantto.beans;

import java.util.List;
import javax.ejb.Local;
import sv.uesocc.edu.ingenieria.tpi135_2018.mantto.entities.CalendarioExcepcion;

/**
 *
 * @author joker
 */
@Local
public interface CalendarioExcepcionFacadeLocal {

    void create(CalendarioExcepcion calendarioExcepcion);

    void edit(CalendarioExcepcion calendarioExcepcion);

    void remove(CalendarioExcepcion calendarioExcepcion);

    CalendarioExcepcion find(Object id);

    List<CalendarioExcepcion> findAll();

    List<CalendarioExcepcion> findRange(int[] range);

    int count();
    
}
