/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.temelt.coursemgmt;

import com.temelt.coursemgmt.model.kullanici.Kullanici;
import com.temelt.coursemgmt.service.kullanici.KullaniciService;
import java.util.List;

/**
 *
 * @author vektorel
 */
public class Runner {
    public static void main(String[] args) {
        KullaniciService kullaniciService=new KullaniciService();
        List<Kullanici> liste = kullaniciService.getAll();
        for (Kullanici kullanici : liste) {
            System.out.println(kullanici.toString());
        }
    }
}
