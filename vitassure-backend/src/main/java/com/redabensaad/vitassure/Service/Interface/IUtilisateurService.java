package com.redabensaad.vitassure.Service.Interface;

import com.redabensaad.vitassure.DTO.response.UtilisateurResponseDTO;
import com.redabensaad.vitassure.Entity.Utilisateur;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import java.util.Optional;

public interface IUtilisateurService {
    Page<Utilisateur> getAllUtilisateurs(Pageable pageable);
    Optional<Utilisateur> getUtilisateurById(Long id);
    Optional<Utilisateur> getUtilisateurByEmail(String email);
    Utilisateur saveUtilisateur(Utilisateur utilisateur);
    Utilisateur updateUtilisateur(Long id, Utilisateur utilisateur);
    void deleteUtilisateur(Long id);
    Utilisateur validerUtilisateur(Long id);
    Utilisateur bloquerUtilisateur(Long id);
    Page<Utilisateur> searchUtilisateurs(String nom, String email, Pageable pageable);
    UtilisateurResponseDTO getCurrentUser();
}
