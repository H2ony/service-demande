package com.m2miage.boundary;

import com.m2miage.entity.Demande;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//@RepositoryRestResource(collectionResourceRel="intervenants")
public interface DemandeRessource  extends JpaRepository<Demande,String>{
    
}
