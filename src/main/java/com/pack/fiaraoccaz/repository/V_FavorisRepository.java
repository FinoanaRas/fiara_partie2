package com.pack.fiaraoccaz.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pack.fiaraoccaz.model.V_Favoris;

public interface V_FavorisRepository extends JpaRepository<V_Favoris, Integer>{
    List<V_Favoris> findAllByUserfav(int iduser);
}
