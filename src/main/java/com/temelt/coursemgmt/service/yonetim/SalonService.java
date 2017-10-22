package com.temelt.coursemgmt.service.yonetim;

import com.temelt.coursemgmt.model.yonetim.Salon;
import com.temelt.coursemgmt.util.IService;
import static com.temelt.coursemgmt.util.IService.baseService;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

public class SalonService implements IService<Salon> {

    public Salon save(Salon entity) {
        return (Salon) baseService.save(entity);
    }

    public Salon update(Salon entity) {
        return (Salon) baseService.update(entity);
    }

    public Boolean delete(Salon entity) {
        return baseService.delete(entity);
    }

    public List<Salon> getAll() {
        return baseService.getAll(Salon.class);
    }

    public Salon getById(Long id) {
        Criteria criteria = baseService.getSession().createCriteria(Salon.class);
        criteria.add(Restrictions.eq("id", id));
        return (Salon) criteria.uniqueResult();
    }

}
