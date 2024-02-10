package com.pack.fiaraoccaz.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.pack.fiaraoccaz.dao.V_FavorisDao;
import com.pack.fiaraoccaz.entity.Token;
import com.pack.fiaraoccaz.entity.User;
import com.pack.fiaraoccaz.model.V_Favoris;
import com.pack.fiaraoccaz.repository.TokenRepository;
import com.pack.fiaraoccaz.service.UserService;

@CrossOrigin(origins = "*")
@RestController 
@RequestMapping("/v_favoris")
public class V_FavorisController {
    private V_FavorisDao vfd;
    @Autowired
    private TokenRepository tokenRe ; 
    @Autowired
    private UserService userService;

    public V_FavorisController(V_FavorisDao vfd){
        this.vfd = vfd;
    }

    @GetMapping("/{token}/getfavoris/{idU}")
    public List<V_Favoris> findAllByUserfav(@PathVariable("token") String token ,@PathVariable("idU") String idU){
        Token tok = tokenRe.findIdUtilsateurFromToken(token); 
        Long id =Long.valueOf(idU);
        int iduser = id.intValue();

        System.out.println();
        User user = userService.findUser(id);
        if(tok!=null && tok.isValid(id) && user.getEtat()==5){
            return vfd.findAllByUserfav(iduser);
        }
        return new ArrayList<>();
    }  
}
