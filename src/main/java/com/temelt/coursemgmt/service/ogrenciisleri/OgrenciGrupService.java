/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.temelt.coursemgmt.service.ogrenciisleri;

import com.temelt.coursemgmt.model.ogrenciisleri.OgrenciGrup;
import com.temelt.coursemgmt.util.IService;
import java.util.List;

/**
 *
 * @author PC
 */
public class OgrenciGrupService implements IService<OgrenciGrup>{

    @Override
    public OgrenciGrup save(OgrenciGrup entity) {
    return (OgrenciGrup) baseService.save(entity);
    }

    @Override
    public OgrenciGrup update(OgrenciGrup entity) {
        return(OgrenciGrup)baseService.update(entity);
    }

    @Override
    public Boolean delete(OgrenciGrup entity) {
    return baseService.delete(entity);
    }

    @Override
    public List<OgrenciGrup> getAll() {
    return baseService.getAll(OgrenciGrup.class);
    }
    
}
