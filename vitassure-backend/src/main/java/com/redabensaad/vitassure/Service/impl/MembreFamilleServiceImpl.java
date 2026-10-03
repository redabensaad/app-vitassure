package com.redabensaad.vitassure.Service.impl;

import com.redabensaad.vitassure.Entity.MembreFamille;
import com.redabensaad.vitassure.Exception.ResourceNotFoundException;
import com.redabensaad.vitassure.Repository.MembreFamilleRepository;
import com.redabensaad.vitassure.Service.Interface.IMembreFamilleService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Transactional
public class MembreFamilleServiceImpl implements IMembreFamilleService {

    private final MembreFamilleRepository membreFamilleRepository;

    @Override
    public List<MembreFamille> getAllMembresFamille() {
        return membreFamilleRepository.findAll();
    }

    @Override
    public Optional<MembreFamille> getMembreFamilleById(Long id) {
        return membreFamilleRepository.findById(id);
    }

    @Override
    public List<MembreFamille> getMembresFamilleByUtilisateurId(Long utilisateurId) {
        return membreFamilleRepository.findByUtilisateurId(utilisateurId);
    }

    @Override
    public MembreFamille saveMembreFamille(MembreFamille membreFamille) {
        return membreFamilleRepository.save(membreFamille);
    }

    @Override
    public void deleteMembreFamille(Long id) {
        if (!membreFamilleRepository.existsById(id)) {
            throw new ResourceNotFoundException("Membre de famille non trouvé avec l'ID : " + id);
        }
        membreFamilleRepository.deleteById(id);
    }

    @Override
    @Transactional
    public MembreFamille updateMembreFamille(Long id, MembreFamille updatedMembreFamille) {
        MembreFamille membreFamille = membreFamilleRepository.findById(id)
            .orElseThrow(() -> new ResourceNotFoundException("Membre de famille non trouvé avec l'ID : " + id));

        membreFamille.setNom(updatedMembreFamille.getNom());
        membreFamille.setPrenom(updatedMembreFamille.getPrenom());
        membreFamille.setDateNaissance(updatedMembreFamille.getDateNaissance());
        membreFamille.setLienParente(updatedMembreFamille.getLienParente());

        return membreFamilleRepository.save(membreFamille);
    }
} 