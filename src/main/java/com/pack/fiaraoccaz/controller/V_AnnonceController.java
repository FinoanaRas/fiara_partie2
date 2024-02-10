package com.pack.fiaraoccaz.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.pack.fiaraoccaz.dao.V_AnnonceDao;
import com.pack.fiaraoccaz.entity.Token;
import com.pack.fiaraoccaz.entity.User;
import com.pack.fiaraoccaz.model.V_Annonce;
import com.pack.fiaraoccaz.repository.TokenRepository;
import com.pack.fiaraoccaz.service.UserService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/v_annonce")
public class V_AnnonceController {
    private V_AnnonceDao vaDao;
    @Autowired
    private TokenRepository tokenRe ; 
    @Autowired
    private UserService userService;

    public V_AnnonceController(V_AnnonceDao vaDao){
        this.vaDao = vaDao;
    }

    @GetMapping("/{token}/getstat/{idU}/{etat}")
    public List<V_Annonce> findAllByEtat(@PathVariable("etat") int etat, @PathVariable("token") String token ,@PathVariable("idU") String idU){
        Token tok = tokenRe.findIdUtilsateurFromToken(token); 
        Long id =Long.valueOf(idU);

        User user = userService.findUser(id);
        if(tok!=null && tok.isValid(id) && user.getEtat()==10){
            return vaDao.findAllByEtat(etat);
        }
        return new ArrayList<>();
    }

    @GetMapping("/type/{idtype}")
    public List<V_Annonce> findAllByIdtype(@PathVariable("idtype") int idtype){
        return vaDao.findAllByIdtype(idtype);
    }

    @GetMapping("/marque/{idmarque}")
    public List<V_Annonce> findAllByIdmarque(@PathVariable("idmarque") int idmarque){
        return vaDao.findAllByIdmarque(idmarque);
    }

    @GetMapping("/modele/{idmodele}")
    public List<V_Annonce> findAllByIdmodele(@PathVariable("idmodele") int idmodele){
        return vaDao.findAllByIdmodele(idmodele);
    }

    @GetMapping("/energie/{idenergie}")
    public List<V_Annonce> findAllByIdenergie(@PathVariable("idenergie") int idenergie){
        return vaDao.findAllByIdenergie(idenergie);
    }

    @GetMapping("/couleur/{idcouleur}")
    public List<V_Annonce> findAllByIdcouleur(@PathVariable("idcouleur") int idcouleur){
        return vaDao.findAllByIdcouleur(idcouleur);
    }

    @GetMapping("/pays/{idpays}")
    public List<V_Annonce> findAllByIdpays(@PathVariable("idpays") int idpays){
        return vaDao.findAllByIdpays(idpays);
    }

    @GetMapping("/boite_vitesse/{idbv}")
    public List<V_Annonce> findAllByIdbv(@PathVariable("idbv") int idbv){
        return vaDao.findAllByIdbv(idbv);
    }

    @GetMapping("/prix/{prixmin}/{prixmax}")
    public List<V_Annonce> findAllByPrixBetween(@PathVariable("prixmin") double prixMin, @PathVariable("prixmax") double prixMax){
        return vaDao.findAllByPrixBetween(prixMin, prixMax);
    }

    @GetMapping("/annee/{anneemin}/{anneemax}")
    public List<V_Annonce> findAllByAnneeBetween(@PathVariable("anneemin") double anneeMin, @PathVariable("anneemax") double anneeMax){
        return vaDao.findAllByAnneeBetween(anneeMin, anneeMax);
    }
}
