package com.pack.fiaraoccaz.repository;

import com.pack.fiaraoccaz.entity.Voiture;
import com.pack.fiaraoccaz.entity.Annonce;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VoitureRepository extends JpaRepository<Voiture, Long> {
    List<Voiture> findByUserId(Long userId);
    @Query("SELECT a FROM Annonce a WHERE a.voiture.utilisateur.iduser = :userId")
    List<Annonce> findAnnoncesByUtilisateurId(Long userId);
}
