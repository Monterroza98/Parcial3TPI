/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.uesocc.edu.ingenieria.tpi135_2018.mantto.beans;

import java.util.List;

/**
 *
 * @author joker
 */
public interface AbstractInterface<T> {
    
    public T create(T entity);
    
    public boolean crear (T entity);
    
    public T edit(T entity);
    
    public boolean editar (T entity);
    
    public boolean remove(T entity);

    public T findById(Object id);
    
    public List<T> findByNameLike(String name, int first, int pagesize);

    public List<T> findAll();
    
    public List<T> findRange(int first, int pageSize);

    public int count();
    
    
}
