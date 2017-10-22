/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.temelt.coursemgmt.service.muhasebe;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.String;
import com.temelt.coursemgmt.model.demirbas.Envanter;
import com.temelt.coursemgmt.model.muhasebe.Gelir;
import com.temelt.coursemgmt.model.ogrenciisleri.OgrenciOdeme;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Master
 */
public class jbdcUtil {
      jbdcConnect c=new jbdcConnect();
    private Map<String, Class<?>> OgrenciOdeme;
      public ResultSet select(String sqlQuery) {
        try {
            Connection connection = c.getConnection();
            System.out.println(sqlQuery);
            PreparedStatement stmt = connection.prepareStatement(sqlQuery);
            return stmt.executeQuery();
        } catch (Exception e) {
        }
        return null;
    }
    
    
    
    
    public List<Gelir> kisileriGetir() {
        List<Gelir> list = new ArrayList();
        try {
            String sqlQuery = " select * from income; ";
            ResultSet resultSet = this.select(sqlQuery);
            while (resultSet.next()) {
                Gelir k = new Gelir();
                k.setId(resultSet.getLong("Id"));
                k.setKonu( "Konu");
                k.setMiktar(resultSet.getBigDecimal( "quantity"));
                k.setOgrenciOdeme((OgrenciOdeme) resultSet.getObject("student_payment_id"));
                k.setTarih(resultSet.getDate( "date"));
                Envanter e=new Envanter();
                k.setEnvanter((Envanter) resultSet.getArray("inventory_id"));
                list.add(k);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}
