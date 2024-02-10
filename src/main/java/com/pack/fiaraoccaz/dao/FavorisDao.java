package com.pack.fiaraoccaz.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.pack.fiaraoccaz.model.Favoris;
import com.pack.fiaraoccaz.repository.FavorisRepository;

@Service
public class FavorisDao {
    private final FavorisRepository favorisRepository;

    public FavorisDao(FavorisRepository favorisRepository){
        this.favorisRepository = favorisRepository;
    }

    public void save(Favoris favoris){
        favorisRepository.save(favoris);
    }

    public int findByUserAndAnnonce(int iduser, int idannonce){
        Favoris fav = favorisRepository.findByIduserAndIdannonce(iduser, idannonce);
        int result = 0;
        if(fav != null){
            result = 1;
        }
        return result;
    }

    public List<Favoris> findAllByIduser(int iduser){
        List<Favoris> result = favorisRepository.findAllByIduser(iduser);
        return result;
    }
}
