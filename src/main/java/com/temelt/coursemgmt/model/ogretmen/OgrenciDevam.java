/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.temelt.coursemgmt.model.ogretmen;

import com.temelt.coursemgmt.model.BaseEntity;
import com.temelt.coursemgmt.model.ogrenciisleri.Ogrenci;
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
@Table(name = "student_attendance")
public class OgrenciDevam extends BaseEntity{

    private Long id;
    private Yoklama yoklama;
    private Ogrenci ogrenci;

    @Id
    @SequenceGenerator(name = "seq_student_attendance", allocationSize = 1, sequenceName = "seq_student_attendance")
    @GeneratedValue(generator = "seq_student_attendance", strategy = GenerationType.SEQUENCE)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @ManyToOne
    @JoinColumn(name = "attendance_id")
    public Yoklama getYoklama() {
        return yoklama;
    }

    public void setYoklama(Yoklama yoklama) {
        this.yoklama = yoklama;
    }

    @ManyToOne
    @JoinColumn(name = "student_id")
    public Ogrenci getOgrenci() {
        return ogrenci;
    }

    public void setOgrenci(Ogrenci ogrenci) {
        this.ogrenci = ogrenci;
    }

}
