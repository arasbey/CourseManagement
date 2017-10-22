/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.temelt.coursemgmt.model.ogretmen;

import com.temelt.coursemgmt.model.BaseEntity;
import com.temelt.coursemgmt.model.yonetim.Grup;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 *
 * @author vektorel
 */
@Entity
@Table(name = "attendance")
public class Yoklama extends BaseEntity{

    private Long id;
    private String aciklama;
    private Grup grup;
    private Date tarih;

    @Id
    @SequenceGenerator(name = "seq_attendance", allocationSize = 1, sequenceName = "seq_attendance")
    @GeneratedValue(generator = "seq_attendance", strategy = GenerationType.SEQUENCE)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "description", length = 100)
    public String getAciklama() {
        return aciklama;
    }

    public void setAciklama(String aciklama) {
        this.aciklama = aciklama;
    }

    @ManyToOne
    @JoinColumn(name = "group_id")
    public Grup getGrup() {
        return grup;
    }

    public void setGrup(Grup grup) {
        this.grup = grup;
    }

    @Column(name = "date")
    public Date getTarih() {
        return tarih;
    }

    public void setTarih(Date tarih) {
        this.tarih = tarih;
    }

}
