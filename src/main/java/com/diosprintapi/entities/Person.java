/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.diosprintapi.entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author wolivdel
 */
@Entity
public class Person implements Serializable {
    @Id
    @GeneratedValue()
    private long id;
    
    private String name;
    
    private String tecnology;
    
    public Person() {}

    public Person(String name, String tecnology) {
        this.name = name;
        this.tecnology = tecnology;
    }
    
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTecnology() {
        return tecnology;
    }

    public void setTecnology(String tecnology) {
        this.tecnology = tecnology;
    }
 
}
