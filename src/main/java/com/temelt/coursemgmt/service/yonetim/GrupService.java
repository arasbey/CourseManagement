package com.temelt.coursemgmt.service.yonetim;

import com.temelt.coursemgmt.model.yonetim.Grup;
import com.temelt.coursemgmt.util.IService;
import static com.temelt.coursemgmt.util.IService.baseService;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

public class GrupService implements IService<Grup> {

    public Grup save(Grup entity) {
        return (Grup) baseService.save(entity);
    }

    public Grup update(Grup entity) {
        return (Grup) baseService.update(entity);
    }

    public Boolean delete(Grup entity) {
        return baseService.delete(entity);
    }

    public List<Grup> getAll() {
        return baseService.getAll(Grup.class);
    }

    public Grup getById(Long id) {
        Criteria criteria = baseService.getSession().createCriteria(Grup.class);
        criteria.add(Restrictions.eq("id", id));
        return (Grup) criteria.uniqueResult();
    }

    
    
    

}
