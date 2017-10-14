/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.temelt.coursemgmt.service.kullanici;

import com.temelt.coursemgmt.model.kullanici.Kullanici;
import com.temelt.coursemgmt.util.CourseHibernateUtil;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author vektorel
 */
public class KullaniciService {
    Session session = CourseHibernateUtil.getSessionFactory().openSession();
    
    public Kullanici save(Kullanici kullanici) {
        session.save(kullanici);
        return kullanici;
    }
    
    public Kullanici update(Kullanici kullanici) {
        session.update(kullanici);
        return kullanici;
    }
    
    public Boolean delete(Kullanici kullanici) {
        session.delete(kullanici);
        return true;
    }
    
    public List<Kullanici> getAll() {
        Criteria criteria =session.createCriteria(Kullanici.class);
        return criteria.list();
    }
    
    public Kullanici getById(Long id) {
        Criteria criteria =session.createCriteria(Kullanici.class);
        criteria.add(Restrictions.eq("id", id));
        return (Kullanici) criteria.uniqueResult();
    }
}
