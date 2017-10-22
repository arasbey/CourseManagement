/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.temelt.coursemgmt.service.ik;

import com.temelt.coursemgmt.model.ik.Personel;
import com.temelt.coursemgmt.util.IService;
import static com.temelt.coursemgmt.util.IService.baseService;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author vektorel
 */
public class PersonelService implements IService<Personel>{
       @Override
    public Personel save(Personel entity) {
        return (Personel) baseService.save(entity);
    }

    @Override
    public Personel update(Personel entity) {
        return (Personel) baseService.update(entity);
    }

    @Override
    public Boolean delete(Personel entity) {
        return baseService.delete(entity);
    }

    @Override
    public List<Personel> getAll() {
        return baseService.getAll(Personel.class);
    }

    public Personel getById(Long id) {
        Criteria criteria = baseService.getSession().createCriteria(Personel.class);
        criteria.add(Restrictions.eq("id", id));
        return (Personel) criteria.uniqueResult();
    }
}
