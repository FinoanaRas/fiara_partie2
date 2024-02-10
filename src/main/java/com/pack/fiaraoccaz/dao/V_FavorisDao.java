package com.pack.fiaraoccaz.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.pack.fiaraoccaz.model.V_Favoris;
import com.pack.fiaraoccaz.repository.V_FavorisRepository;

@Service
public class V_FavorisDao {
    private V_FavorisRepository vfr;

    public V_FavorisDao(V_FavorisRepository vfr){
        this.vfr = vfr;
    }

    public List<V_Favoris> findAllByUserfav(int iduser){
        return vfr.findAllByUserfav(iduser);
    }
}
