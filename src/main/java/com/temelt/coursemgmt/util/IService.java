/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.temelt.coursemgmt.util;

import java.util.List;

/**
 *
 * @author vektorel
 */
public interface IService<T> {
    
    BaseService baseService = new BaseService();

    T save(T entity);

    T update(T entity);

    Boolean delete(T entity);

    List<T> getAll();

}
