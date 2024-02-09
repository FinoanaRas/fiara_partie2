package com.pack.fiaraoccaz.controller;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import java.io.File;
import java.io.IOException;
import java.util.Base64;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.pack.fiaraoccaz.dao.PictureDao;
import com.pack.fiaraoccaz.entity.Token;
import com.pack.fiaraoccaz.entity.User;
import com.pack.fiaraoccaz.model.Picture;
import com.pack.fiaraoccaz.repository.TokenRepository;
import com.pack.fiaraoccaz.service.UserService;

@RestController
@RequestMapping("/api/picture")
public class PictureController {
    private PictureDao pictureDao;
    @Autowired
    private TokenRepository tokenRe ; 
    @Autowired
    private UserService userService;

    public PictureController(PictureDao pictureDao){
        this.pictureDao = pictureDao;
    }

    @PostMapping("/{token}/upload/{idU}")
    public ResponseEntity<String> uploadPart2(@RequestBody Picture pict, @PathVariable("token") String token ,@PathVariable("idU") String idU) {
        try {
            Token tok = tokenRe.findIdUtilsateurFromToken(token); 
            Long id =Long.valueOf(idU);

            User user = userService.findUser(id);
            if(tok!=null && tok.isValid(id) && user.getEtat()==10){
                byte[] decodedBytes = Base64.getDecoder().decode(pict.getBase64());
                File outputFile = new File("D:/Application/uploadbase64/image/" + pict.getPicture());
                FileUtils.writeByteArrayToFile(outputFile, decodedBytes);
                return ResponseEntity.ok("File decoded successfully.");
            }
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("No token");
        } catch (IOException e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Failed to decode Base64 string.");
        }
    }
}
