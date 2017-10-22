/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.temelt.coursemgmt.service.ogrenciisleri;

import com.temelt.coursemgmt.model.ogrenciisleri.OgrenciOdeme;
import com.temelt.coursemgmt.util.IService;
import java.util.List;

/**
 *
 * @author PC
 */
public class OgrenciOdemeService implements IService<OgrenciOdeme>{

    @Override
    public OgrenciOdeme save(OgrenciOdeme entity) {
    return (OgrenciOdeme) baseService.save(entity);
    }

    @Override
    public OgrenciOdeme update(OgrenciOdeme entity) {
    return (OgrenciOdeme) baseService.update(entity);
    }

    @Override
    public Boolean delete(OgrenciOdeme entity) {
    return baseService.delete(entity);
    }

    @Override
    public List<OgrenciOdeme> getAll() {
    return baseService.getAll(OgrenciOdeme.class);
    }
    
}
