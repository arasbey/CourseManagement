/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.temelt.coursemgmt.model.ogretmen;

import com.temelt.coursemgmt.model.ogrenciisleri.Ogrenci;

/**
 *
 * @author vektorel
 */
public class OgrenciDevam {
    private Long id;
    private Yoklama yoklama;
    private Ogrenci ogrenci;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Yoklama getYoklama() {
        return yoklama;
    }

    public void setYoklama(Yoklama yoklama) {
        this.yoklama = yoklama;
    }

    public Ogrenci getOgrenci() {
        return ogrenci;
    }

    public void setOgrenci(Ogrenci ogrenci) {
        this.ogrenci = ogrenci;
    }
    
    
}
