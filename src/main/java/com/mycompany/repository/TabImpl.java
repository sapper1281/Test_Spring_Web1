/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.repository;

import com.mycompany.dto.Tab;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author александр
 */
@Transactional(readOnly = true)
public class TabImpl implements TabFilter{
    @PersistenceContext
    private EntityManager em;

    public Tab findTab(Long idTab) {
         TypedQuery createQuery = em.createQuery("SELECT u FROM Tab u WHERE u.id=:id", Tab.class);
         createQuery.setParameter("id", idTab);
         return (Tab)createQuery.getResultList().get(0);
    }

    @Override
    public List<Tab> findAllTab() {
        StringBuilder query = new StringBuilder("SELECT d FROM Tab AS d ");
        Query createQuery = em.createQuery(query.toString());
        return (List<Tab>) createQuery.getResultList();
    }
}
