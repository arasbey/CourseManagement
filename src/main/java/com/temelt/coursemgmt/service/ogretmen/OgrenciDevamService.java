package com.temelt.coursemgmt.service.ogretmen;

import com.temelt.coursemgmt.model.ogretmen.OgrenciDevam;
import com.temelt.coursemgmt.util.IService;
import static com.temelt.coursemgmt.util.IService.baseService;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

public class OgrenciDevamService implements IService<OgrenciDevam> {

    @Override
    public OgrenciDevam save(OgrenciDevam entity) {
        return (OgrenciDevam) baseService.save(entity);
    }

    @Override
    public OgrenciDevam update(OgrenciDevam entity) {
        return (OgrenciDevam) baseService.update(entity);
    }

    @Override
    public Boolean delete(OgrenciDevam entity) {
        return baseService.delete(entity);
    }

    @Override
    public List<OgrenciDevam> getAll() {
        return baseService.getAll(OgrenciDevam.class);
    }
    
    public OgrenciDevam getById(Long id) {
        Criteria criteria = baseService.getSession().createCriteria(OgrenciDevam.class);
        criteria.add(Restrictions.eq("id", id));
        return (OgrenciDevam) criteria.uniqueResult();
    }
   

}
