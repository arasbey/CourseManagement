/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.temelt.coursemgmt.service.ogrenciisleri;

import com.temelt.coursemgmt.model.ogrenciisleri.Ogrenci;
import com.temelt.coursemgmt.util.IService;
import java.util.List;

/**
 *
 * @author PC
 */
public class OgrenciService implements IService<Ogrenci>{

    @Override
    public Ogrenci save(Ogrenci entity) {
       return (Ogrenci)baseService.save(entity);
    }

    @Override
    public Ogrenci update(Ogrenci entity) {
    return (Ogrenci)baseService.update(entity);    
    }

    @Override
    public Boolean delete(Ogrenci entity) {
    return baseService.delete(entity);
    }

    @Override
    public List<Ogrenci> getAll() {
    return baseService.getAll(Ogrenci.class);
    }
    
}
