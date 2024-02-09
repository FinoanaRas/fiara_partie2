package com.pack.fiaraoccaz.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pack.fiaraoccaz.model.Picture;

public interface PictureRepository extends JpaRepository<Picture, Integer>{
    
}
