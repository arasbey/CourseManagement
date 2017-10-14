/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.temelt.coursemgmt.model.demirbas;

import com.temelt.coursemgmt.model.muhasebe.Gider;
import java.util.Date;

/**
 *
 * @author vektorel
 */
public class Envanter {
    private Long id;
    private String tanim;
    private String aciklama;
    private Boolean garanti;
    private Date garantiBaslamaTarihi;
    private Date garantiBitisTarihi;
    private Gider gider;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTanim() {
        return tanim;
    }

    public void setTanim(String tanim) {
        this.tanim = tanim;
    }

    public String getAciklama() {
        return aciklama;
    }

    public void setAciklama(String aciklama) {
        this.aciklama = aciklama;
    }

    public Boolean getGaranti() {
        return garanti;
    }

    public void setGaranti(Boolean garanti) {
        this.garanti = garanti;
    }

    public Date getGarantiBaslamaTarihi() {
        return garantiBaslamaTarihi;
    }

    public void setGarantiBaslamaTarihi(Date garantiBaslamaTarihi) {
        this.garantiBaslamaTarihi = garantiBaslamaTarihi;
    }

    public Date getGarantiBitisTarihi() {
        return garantiBitisTarihi;
    }

    public void setGarantiBitisTarihi(Date garantiBitisTarihi) {
        this.garantiBitisTarihi = garantiBitisTarihi;
    }

    public Gider getGider() {
        return gider;
    }

    public void setGider(Gider gider) {
        this.gider = gider;
    }
    
}
