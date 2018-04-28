/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.uesocc.edu.ingenieria.tpi135_2018.mantto.boundaries;

import javax.ejb.EJB;
import javax.ws.rs.Path;
import sv.uesocc.edu.ingenieria.tpi135_2018.mantto.beans.AbstractInterface;
import sv.uesocc.edu.ingenieria.tpi135_2018.mantto.beans.DiagnosticoParteFacadeLocal;
import sv.uesocc.edu.ingenieria.tpi135_2018.mantto.entities.DiagnosticoParte;


/**
 *
 * @author joker
 */
@Path("diagnosticoparte")
public class DiagnosticoParteResource extends AbstractResource<DiagnosticoParte>{
    
    @EJB
    private DiagnosticoParteFacadeLocal dpfl;

    @Override
    protected AbstractInterface<DiagnosticoParte> getFacade() {
        return dpfl;
    }

    @Override
    protected DiagnosticoParte crearNuevo() {
        return new DiagnosticoParte();
    }
    

    
}
