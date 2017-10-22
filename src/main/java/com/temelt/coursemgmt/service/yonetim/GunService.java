package com.temelt.coursemgmt.service.yonetim;

import com.temelt.coursemgmt.model.yonetim.Gun;
import com.temelt.coursemgmt.util.IService;
import java.util.List;

public class GunService implements IService<Gun> {

    @Override
    public Gun save(Gun entity) {
        return (Gun) baseService.save(entity);
    }

    @Override
    public Gun update(Gun entity) {
        return (Gun) baseService.update(entity);
    }

    @Override
    public Boolean delete(Gun entity) {
        return baseService.delete(entity);
    }

    @Override
    public List<Gun> getAll() {
        return baseService.getAll(Gun.class);
    }

}
