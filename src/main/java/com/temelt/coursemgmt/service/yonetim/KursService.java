package com.temelt.coursemgmt.service.yonetim;

import com.temelt.coursemgmt.model.yonetim.Kurs;
import com.temelt.coursemgmt.util.IService;
import static com.temelt.coursemgmt.util.IService.baseService;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

public class KursService implements IService<Kurs> {

    public Kurs save(Kurs entity) {
        return (Kurs) baseService.save(entity);
    }

    public Kurs update(Kurs entity) {
        return (Kurs) baseService.update(entity);
    }

    public Boolean delete(Kurs entity) {
        return baseService.delete(entity);
    }

    public List<Kurs> getAll() {
        return baseService.getAll(Kurs.class);
    }

    public Kurs getById(Long id) {
        Criteria criteria = baseService.getSession().createCriteria(Kurs.class);
        criteria.add(Restrictions.eq("id", id));
        return (Kurs) criteria.uniqueResult();
    }
}
