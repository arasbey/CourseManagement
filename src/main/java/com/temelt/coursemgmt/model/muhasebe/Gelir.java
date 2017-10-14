/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.temelt.coursemgmt.model.muhasebe;

import com.temelt.coursemgmt.model.demirbas.Envanter;
import com.temelt.coursemgmt.model.ogrenciisleri.OgrenciOdeme;
import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author vektorel
 */
public class Gelir {

    private Long id;
    private String konu;
    private BigDecimal miktar;
    private Date tarih;
    private OgrenciOdeme ogrenciOdeme;
    private Envanter envanter;
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getKonu() {
        return konu;
    }

    public void setKonu(String konu) {
        this.konu = konu;
    }

    public BigDecimal getMiktar() {
        return miktar;
    }

    public void setMiktar(BigDecimal miktar) {
        this.miktar = miktar;
    }

    public Date getTarih() {
        return tarih;
    }

    public void setTarih(Date tarih) {
        this.tarih = tarih;
    }

    public OgrenciOdeme getOgrenciOdeme() {
        return ogrenciOdeme;
    }

    public void setOgrenciOdeme(OgrenciOdeme ogrenciOdeme) {
        this.ogrenciOdeme = ogrenciOdeme;
    }

    public Envanter getEnvanter() {
        return envanter;
    }

    public void setEnvanter(Envanter envanter) {
        this.envanter = envanter;
    }
    
    
}
