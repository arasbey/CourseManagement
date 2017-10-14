/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.temelt.coursemgmt.model.ogrenciisleri;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author vektorel
 */
@Entity
@Table(name="StudentPayment")
public class OgrenciOdeme {
    private Long id;
    private String aciklama;
    private BigDecimal odemeMiktari;
    private Ogrenci ogrenci;
    private Date odemeTarihi;
@Id
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
@Column(name = "Notes",length = 300)
    public String getAciklama() {
        return aciklama;
    }

    public void setAciklama(String aciklama) {
        this.aciklama = aciklama;
    }
@Column(name = "PaymentTotal",length = 30)
    public BigDecimal getOdemeMiktari() {
        return odemeMiktari;
    }

    public void setOdemeMiktari(BigDecimal odemeMiktari) {
        this.odemeMiktari = odemeMiktari;
    }
@Column(name = "Student",length = 30)
    public Ogrenci getOgrenci() {
        return ogrenci;
    }

    public void setOgrenci(Ogrenci ogrenci) {
        this.ogrenci = ogrenci;
    }
@Column(name = "DateofPayment",length = 30)
    public Date getOdemeTarihi() {
        return odemeTarihi;
    }

    public void setOdemeTarihi(Date odemeTarihi) {
        this.odemeTarihi = odemeTarihi;
    }
    
    
}
