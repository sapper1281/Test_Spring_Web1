/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.repository;

import com.mycompany.dto.Tab;
import java.util.List;

/**
 *
 * @author александр
 */
public interface TabFilter {

    /**
     * tab с name
     * @param id id пользователя
     * @return id с name
     */
    Tab findTab(Long idTab);
    /**
     * tab с name
     * @param id id пользователя
     * @return id с name
     */
    List<Tab> findAllTab();

}