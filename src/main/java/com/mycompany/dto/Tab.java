/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dto;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;



/**
 *
 * @author александр
 */
@Entity
@javax.persistence.Table(name = "TAB")
@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class Tab implements Serializable {
    //<editor-fold defaultstate="collapsed" desc="поля">
    //идентификатор
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;
    
    //имя 
    @Column(name = "name")
    private String name;
    //</editor-fold>
    
            
 
    //<editor-fold defaultstate="collapsed" desc="get,set">
    /**
     * идентификатор
     * @return id идентификатор
     */
    public
         Long getId() {
             return id;
         }
         /**
          * идентификатор
          * @param id идентификатор
          */
         public void setID(Long id) {
             this.id = id;
         }
         /**
          * имя
          * @return name имя
          */
         public String getName() {
             return name;
         }
         /**
          * имя
          * @param name имя
          */
         public void setName(String name) {
             this.name = name;
         }
//</editor-fold>
    
            
    @Override
    public String toString() {
        return "Table{"  + "id=" + id + ", name=" + name + '}';
    }
    
   
    
}
