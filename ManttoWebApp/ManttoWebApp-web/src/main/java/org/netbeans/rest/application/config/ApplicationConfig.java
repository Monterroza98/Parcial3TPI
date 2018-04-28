/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.netbeans.rest.application.config;

import java.util.Set;
import javax.ws.rs.core.Application;

/**
 *
 * @author joker
 */
@javax.ws.rs.ApplicationPath("webresources")
public class ApplicationConfig extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new java.util.HashSet<>();
        addRestResourceClasses(resources);
        return resources;
    }

    /**
     * Do not modify addRestResourceClasses() method.
     * It is automatically populated with
     * all resources defined in the project.
     * If required, comment out calling this method in getClasses().
     */
    private void addRestResourceClasses(Set<Class<?>> resources) {
        resources.add(org.netbeans.rest.application.config.CorsFilters.class);
        resources.add(sv.uesocc.edu.ingenieria.tpi135_2018.mantto.boundaries.DiagnosticoParteResource.class);
        resources.add(sv.uesocc.edu.ingenieria.tpi135_2018.mantto.boundaries.DiagnosticoResource.class);
        resources.add(sv.uesocc.edu.ingenieria.tpi135_2018.mantto.boundaries.EquipoDetalleResource.class);
        resources.add(sv.uesocc.edu.ingenieria.tpi135_2018.mantto.boundaries.EquipoResource.class);
        resources.add(sv.uesocc.edu.ingenieria.tpi135_2018.mantto.boundaries.EstadoMantenimientoDetalleResource.class);
        resources.add(sv.uesocc.edu.ingenieria.tpi135_2018.mantto.boundaries.EstadoResource.class);
        resources.add(sv.uesocc.edu.ingenieria.tpi135_2018.mantto.boundaries.MantenimientoDetalleResources.class);
        resources.add(sv.uesocc.edu.ingenieria.tpi135_2018.mantto.boundaries.MarcaResource.class);
        resources.add(sv.uesocc.edu.ingenieria.tpi135_2018.mantto.boundaries.ModeloResource.class);
        resources.add(sv.uesocc.edu.ingenieria.tpi135_2018.mantto.boundaries.OrdenTrabajoResource.class);
        resources.add(sv.uesocc.edu.ingenieria.tpi135_2018.mantto.boundaries.ParteResource.class);
        resources.add(sv.uesocc.edu.ingenieria.tpi135_2018.mantto.boundaries.PasoResource.class);
        resources.add(sv.uesocc.edu.ingenieria.tpi135_2018.mantto.boundaries.PrioridadResource.class);
        resources.add(sv.uesocc.edu.ingenieria.tpi135_2018.mantto.boundaries.ProcedimientoResource.class);
        resources.add(sv.uesocc.edu.ingenieria.tpi135_2018.mantto.boundaries.ResponsableResource.class);
        resources.add(sv.uesocc.edu.ingenieria.tpi135_2018.mantto.boundaries.SolicitudResource.class);
        resources.add(sv.uesocc.edu.ingenieria.tpi135_2018.mantto.boundaries.SubTipoMantenimientoResource.class);
        resources.add(sv.uesocc.edu.ingenieria.tpi135_2018.mantto.boundaries.TipoMantenimientoResource.class);
        resources.add(sv.uesocc.edu.ingenieria.tpi135_2018.mantto.boundaries.TipoParteResource.class);
        resources.add(sv.uesocc.edu.ingenieria.tpi135_2018.mantto.boundaries.TipoResponsableResorce.class);
        resources.add(sv.uesocc.edu.ingenieria.tpi135_2018.mantto.boundaries.UnidadResource.class);
        resources.add(sv.uesocc.edu.ingenieria.tpi135_2018.mantto.web.exceptions.ControllerExceptionMapper.class);
        resources.add(sv.uesocc.edu.ingenieria.tpi135_2018.mantto.web.exceptions.ExceptionMapper.class);
        resources.add(sv.uesocc.edu.ingenieria.tpi135_2018.mantto.web.exceptions.NotFoundMapper.class);
    }
    
}
