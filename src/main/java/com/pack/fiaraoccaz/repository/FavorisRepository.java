package com.pack.fiaraoccaz.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pack.fiaraoccaz.model.Favoris;

public interface FavorisRepository extends JpaRepository<Favoris, Integer> {
    Favoris findByIduserAndIdannonce(int iduser, int idannonce);
    List<Favoris> findAllByIduser(int iduser);
}
