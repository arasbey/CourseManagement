/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.temelt.coursemgmt.service.muhasebe;

import com.temelt.coursemgmt.model.muhasebe.Gelir;
import com.temelt.coursemgmt.model.ogrenciisleri.Ogrenci;
import com.temelt.coursemgmt.model.ogrenciisleri.OgrenciOdeme;
import com.temelt.coursemgmt.util.CourseHibernateUtil;
import com.temelt.coursemgmt.util.IService;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;


/**
 *
 * @author vektorel
 */
public class GelirService implements IService<Gelir>{

    @Override
    public Gelir save(Gelir entity) {
     return (Gelir) baseService.save(entity);
    }

    @Override
    public Gelir update(Gelir entity) {
        return (Gelir) baseService.update(entity);
    }

    @Override
    public Boolean delete(Gelir entity) {
       return  baseService.delete(entity);
    }

    @Override
    public List<Gelir> getAll() {
        return baseService.getAll(Gelir.class);
    }
    
    public List<OgrenciOdeme> getAllO() {
        return baseService.getAll(OgrenciOdeme.class);
    }
    public List<Ogrenci> getAllOg() {
        return baseService.getAll(Ogrenci.class);
    }
 
     public List<Gelir> getByIdd(long id) {
        Session session= CourseHibernateUtil.getSessionFactory().openSession();
        Criteria criteria= session.createCriteria(Gelir.class);
        criteria.add(Restrictions.eq( "id", id));
        return criteria.list();
    }
    
    
}
