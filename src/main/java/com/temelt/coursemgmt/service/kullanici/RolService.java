/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.temelt.coursemgmt.service.kullanici;

import com.temelt.coursemgmt.model.kullanici.Rol;
import com.temelt.coursemgmt.util.IService;
import java.util.List;

/**
 *
 * @author vektorel
 */
public class RolService implements IService<Rol>{

    @Override
    public Rol save(Rol entity) {
        return (Rol) baseService.save(entity);
    }

    @Override
    public Rol update(Rol entity) {
        return (Rol) baseService.update(entity);
    }

    @Override
    public Boolean delete(Rol entity) {
        return baseService.delete(entity);
    }

    @Override
    public List<Rol> getAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


}
