/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.temelt.coursemgmt.service.kullanici;

import com.temelt.coursemgmt.model.kullanici.Kullanici;
import com.temelt.coursemgmt.util.IService;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author vektorel
 */
public class KullaniciService implements IService<Kullanici>{

    @Override
    public Kullanici save(Kullanici entity) {
        return (Kullanici) baseService.save(entity);
    }

    @Override
    public Kullanici update(Kullanici entity) {
        return (Kullanici) baseService.update(entity);
    }

    @Override
    public Boolean delete(Kullanici entity) {
        return  baseService.delete(entity);
    }

    @Override
    public List<Kullanici> getAll() {
        return baseService.getAll(Kullanici.class);
    }

    public Kullanici getById(Long id) {
        Criteria criteria = baseService.getSession().createCriteria(Kullanici.class);
        criteria.add(Restrictions.eq("id", id));
        return (Kullanici) criteria.uniqueResult();
    }

    public Kullanici getByUsernameAndPassword(String kullaniciAdi, String sifre) {
        Criteria criteria = baseService.getSession().createCriteria(Kullanici.class);
        criteria.add(Restrictions.eq("kullaniciAdi", kullaniciAdi));
        criteria.add(Restrictions.eq("sifre", sifre));
        return (Kullanici) criteria.uniqueResult();
    }
    
}
