package com.temelt.coursemgmt.service.ogretmen;

import com.temelt.coursemgmt.model.ogretmen.Yoklama;
import com.temelt.coursemgmt.util.IService;
import static com.temelt.coursemgmt.util.IService.baseService;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

public class YoklamaService implements IService<Yoklama> {

    @Override
    public Yoklama save(Yoklama entity) {
        return (Yoklama) baseService.save(entity);
    }

    @Override
    public Yoklama update(Yoklama entity) {
        return (Yoklama) baseService.update(entity);
    }

    @Override
    public Boolean delete(Yoklama entity) {
        return baseService.delete(entity);
    }

    @Override
    public List<Yoklama> getAll() {
        return baseService.getAll(Yoklama.class);
    }
    
    public Yoklama getById(Long id) {
        Criteria criteria = baseService.getSession().createCriteria(Yoklama.class);
        criteria.add(Restrictions.eq("id", id));
        return (Yoklama) criteria.uniqueResult();
    }

}
