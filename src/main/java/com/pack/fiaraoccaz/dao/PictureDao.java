package com.pack.fiaraoccaz.dao;

import org.springframework.stereotype.Service;

import com.pack.fiaraoccaz.model.Picture;
import com.pack.fiaraoccaz.repository.PictureRepository;

@Service
public class PictureDao {
    private PictureRepository pr;

    public PictureDao(PictureRepository pr){
        this.pr = pr;
    }

    public Picture saveMessage(Picture picture) {
        return pr.save(picture);
    }
}