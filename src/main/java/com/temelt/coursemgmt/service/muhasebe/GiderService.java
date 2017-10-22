/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.temelt.coursemgmt.service.muhasebe;

import com.temelt.coursemgmt.model.demirbas.Envanter;
import com.temelt.coursemgmt.model.ik.Ogretmen;
import com.temelt.coursemgmt.model.ik.Personel;
import com.temelt.coursemgmt.model.muhasebe.Gider;
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
public class GiderService implements IService<Gider>{

    @Override
    public Gider save(Gider entity) {
        return (Gider) baseService.save(entity);
    }

    @Override
    public Gider update(Gider entity) {
         return (Gider) baseService.update(entity);
    }

    @Override
    public Boolean delete(Gider entity) {
         return  baseService.delete(entity);
    }

    @Override
    public List<Gider> getAll() {
        return baseService.getAll(Gider.class);
    }
    public List<Envanter> getAllE() {
        return baseService.getAll(Envanter.class);
    }
    public List<Personel> getAllP() {
        return baseService.getAll(Personel.class);
    }
    public List<Ogretmen> getAllOg() {
        return baseService.getAll(Ogretmen.class);
    }
        
    public List<Gider> getByIdd(long id) {
        Session session= CourseHibernateUtil.getSessionFactory().openSession();
        Criteria criteria= session.createCriteria(Gider.class);
        criteria.add(Restrictions.eq( "id", id));
        return criteria.list();
    }
    
}
