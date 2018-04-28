/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.uesocc.edu.ingenieria.tpi135_2018.mantto.beans;

import java.util.List;
import javax.ejb.Local;
import sv.uesocc.edu.ingenieria.tpi135_2018.mantto.entities.TipoParte;

/**
 *
 * @author joker
 */
@Local
public interface TipoParteFacadeLocal {

    void create(TipoParte tipoParte);

    void edit(TipoParte tipoParte);

    void remove(TipoParte tipoParte);

    TipoParte find(Object id);

    List<TipoParte> findAll();

    List<TipoParte> findRange(int[] range);

    int count();
    
}
