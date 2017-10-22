package com.temelt.coursemgmt.service.yonetim;

import com.temelt.coursemgmt.model.yonetim.GrupGun;
import com.temelt.coursemgmt.util.IService;
import static com.temelt.coursemgmt.util.IService.baseService;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

public class GrupGunService implements IService<GrupGun> {

    public GrupGun update(GrupGun entity) {
        return (GrupGun) baseService.update(entity);
    }

    public GrupGun save(GrupGun entity) {
        return (GrupGun) baseService.save(entity);
    }

    public Boolean delete(GrupGun entity) {
        return baseService.delete(entity);
    }

    public List<GrupGun> getAll() {
        return baseService.getAll(GrupGun.class);
    }

    public GrupGun getById(Long id) {
        Criteria criteria = baseService.getSession().createCriteria(GrupGun.class);
        criteria.add(Restrictions.eq("id", id));
        return (GrupGun) criteria.uniqueResult();
    }

}
