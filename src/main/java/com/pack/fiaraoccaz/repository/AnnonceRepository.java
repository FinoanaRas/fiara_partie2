package com.pack.fiaraoccaz.repository;

import com.pack.fiaraoccaz.entity.Annonce;
import com.pack.fiaraoccaz.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

@Repository
public interface AnnonceRepository extends JpaRepository<Annonce, Long>, JpaSpecificationExecutor<Annonce> {

    @Query("SELECT a FROM Annonce a INNER JOIN Voiture v ON a.voiture.id = v.id WHERE v.utilisateur.iduser = :userId")
    List<Annonce> findByUserId(Long userId);
}
