package com.pack.fiaraoccaz.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pack.fiaraoccaz.model.V_Annonce_2;

public interface V_annonce_2Repository extends JpaRepository<V_Annonce_2, Integer>{
    List<V_Annonce_2> findAllByEtatAndStatus(int etat, int status);
    
}
