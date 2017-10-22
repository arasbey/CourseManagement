/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.temelt.coursemgmt.service.ik;

import com.temelt.coursemgmt.model.ik.Ogretmen;
import com.temelt.coursemgmt.util.IService;
import static com.temelt.coursemgmt.util.IService.baseService;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author vektorel
 */
public class OgretmenService implements IService<Ogretmen> {

   @Override
    public Ogretmen save(Ogretmen entity) {
        return (Ogretmen) baseService.save(entity);
    }

    @Override
    public Ogretmen update(Ogretmen entity) {
        return (Ogretmen) baseService.update(entity);
    }

    @Override
    public Boolean delete(Ogretmen entity) {
        return baseService.delete(entity);
    }

    @Override
    public List<Ogretmen> getAll() {
        return baseService.getAll(Ogretmen.class);
    }
    public Ogretmen getById(Long id) {
        Criteria criteria = baseService.getSession().createCriteria(Ogretmen.class);
        criteria.add(Restrictions.eq("id", id));
        return (Ogretmen) criteria.uniqueResult();
    }


}
