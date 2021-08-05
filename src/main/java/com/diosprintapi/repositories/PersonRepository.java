/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.diosprintapi.repositories;

import com.diosprintapi.entities.Person;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author wolivdel
 */
public interface PersonRepository extends JpaRepository<Person, Long> {
    
}
