package com.pack.fiaraoccaz.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.pack.fiaraoccaz.model.V_Annonce_2;
import com.pack.fiaraoccaz.repository.V_annonce_2Repository;

@Service
public class V_Annonce_2Dao {
    private V_annonce_2Repository va2;

    public V_Annonce_2Dao(V_annonce_2Repository va2){
        this.va2 = va2;
    }

    public List<V_Annonce_2> findAllByEtatAndStatus(int etat, int status){
        List<V_Annonce_2> result = va2.findAllByEtatAndStatus(etat, status);
        return result; 
    }
}
