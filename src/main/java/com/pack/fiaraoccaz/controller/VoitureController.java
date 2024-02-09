package com.pack.fiaraoccaz.controller;

import com.pack.fiaraoccaz.entity.Voiture;
import com.pack.fiaraoccaz.service.VoitureService;
import com.pack.fiaraoccaz.entity.Token;
import com.pack.fiaraoccaz.entity.User;
import com.pack.fiaraoccaz.repository.TokenRepository;
import com.pack.fiaraoccaz.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "https://earnest-gumption-0c0eac.netlify.app")
@RestController
@RequestMapping("/api/voitures")
public class VoitureController {

    // @Autowired
    // private VoitureService voitureService;
    
    // @Autowired
    // private TokenRepository tokenRepository;
    
    // @Autowired
    // private UserService userService;

    // @PostMapping("/{token}/create/{id}")
    // public ResponseEntity<String> createVoiture(@RequestBody Voiture voiture, @PathVariable("token") String token, @PathVariable("id") Long userId) {
    //     Token tok = tokenRepository.findIdUtilsateurFromToken(token);
    //     User user = userService.findUser(userId);
        
    //     if (tok != null && tok.isValid(userId) && user.getEtat() == 10) {
    //         voitureService.createVoiture(voiture);
    //         return ResponseEntity.ok("Voiture créée avec succès");
    //     }
        
    //     return ResponseEntity.badRequest().body("Vous n'avez pas les autorisations nécessaires pour effectuer cette action.");
    // }

    // @GetMapping("/{token}/getAll/{id}")
    // public ResponseEntity<List<Voiture>> getAllVoitures(@PathVariable("token") String token, @PathVariable("id") Long userId) {
    //     Token tok = tokenRepository.findIdUtilsateurFromToken(token);
    //     User user = userService.findUser(userId);
        
    //     if (tok != null && tok.isValid(userId) && user.getEtat() == 10) {
    //         List<Voiture> voitures = voitureService.getAllVoitures();
    //         return ResponseEntity.ok(voitures);
    //     }
        
    //     return ResponseEntity.badRequest().build();
    // }

    // @GetMapping("/{token}/getByUser/{id}")
    // public ResponseEntity<List<Voiture>> getVoituresByUserId(@PathVariable("token") String token, @PathVariable("id") Long userId) {
    //     Token tok = tokenRepository.findIdUtilsateurFromToken(token);
    //     User user = userService.findUser(userId);
        
    //     if (tok != null && tok.isValid(userId) && user.getEtat() == 10) {
    //         List<Voiture> voitures = voitureService.getVoituresByUserId(userId);
    //         return ResponseEntity.ok(voitures);
    //     }
        
    //     return ResponseEntity.badRequest().build();
    // }

    // @DeleteMapping("/{token}/delete/{id}")
    // public ResponseEntity<Void> deleteVoitureById(@PathVariable("token") String token, @PathVariable("id") Long voitureId) {
    //     Token tok = tokenRepository.findIdUtilsateurFromToken(token);
        
    //     if (tok != null && tok.isValid(voitureId)) {
    //         voitureService.deleteVoiture(voitureId);
    //         return ResponseEntity.noContent().build();
    //     }
        
    //     return ResponseEntity.badRequest().build();
    // }

    // @GetMapping("/{token}/get/{id}")
    // public ResponseEntity<Voiture> getVoitureById(@PathVariable("token") String token, @PathVariable("id") Long voitureId) {
    //     Token tok = tokenRepository.findIdUtilsateurFromToken(token);
        
    //     if (tok != null && tok.isValid(voitureId)) {
    //         Voiture voiture = voitureService.getVoitureById(voitureId).orElse(null);
    //         if (voiture != null) {
    //             return ResponseEntity.ok(voiture);
    //         }
    //     }
        
    //     return ResponseEntity.notFound().build();
    // }

    // @PutMapping("/{token}/update/{id}")
    // public ResponseEntity<Void> updateVoitureById(@PathVariable("token") String token, @PathVariable("id") Long voitureId, @RequestBody Voiture updatedVoiture) {
    //     Token tok = tokenRepository.findIdUtilsateurFromToken(token);
        
    //     if (tok != null && tok.isValid(voitureId)) {
    //         Voiture voiture = voitureService.getVoitureById(voitureId).orElse(null);
    //         if (voiture != null) {
    //             voitureService.updateVoiture(voitureId, updatedVoiture);
    //             return ResponseEntity.noContent().build();
    //         }
    //     }
        
    //     return ResponseEntity.badRequest().build();
    // }
}

