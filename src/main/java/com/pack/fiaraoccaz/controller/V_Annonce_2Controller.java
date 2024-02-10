package com.pack.fiaraoccaz.controller;

import java.util.*;

import org.springframework.web.bind.annotation.*;

import com.pack.fiaraoccaz.dao.V_Annonce_2Dao;
import com.pack.fiaraoccaz.model.V_Annonce_2;

@CrossOrigin(origins = "*")
@RestController 
@RequestMapping("/v_annonce_2")
public class V_Annonce_2Controller {
    private V_Annonce_2Dao vaDao;

    public V_Annonce_2Controller(V_Annonce_2Dao vaDao){
        this.vaDao = vaDao;
    }

    @GetMapping("/gets/{etat}/{status}")
    public List<V_Annonce_2> findAllByEtatAndStatus(@PathVariable("etat") int etat, @PathVariable("status") int status){
            return vaDao.findAllByEtatAndStatus(etat, status);
    }
}
