package com.redabensaad.vitassure.Service.impl;

import com.redabensaad.vitassure.Entity.Rapport;
import com.redabensaad.vitassure.Exception.ResourceNotFoundException;
import com.redabensaad.vitassure.Repository.RapportRepository;
import com.redabensaad.vitassure.Service.Interface.IRapportService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Transactional
public class RapportServiceImpl implements IRapportService {

    private final RapportRepository rapportRepository;

    @Override
    public List<Rapport> getAllRapports() {
        return rapportRepository.findAll();
    }

    @Override
    public Optional<Rapport> getRapportById(Long id) {
        return rapportRepository.findById(id);
    }

    @Override
    public List<Rapport> getRapportsByDossierId(Long dossierId) {
        return rapportRepository.findByDossierId(dossierId);
    }

    @Override
    @Transactional
    public Rapport saveRapport(Rapport rapport) {
        if (rapport.getDateRapport() == null) {
            rapport.setDateRapport(LocalDate.now());
        }
        return rapportRepository.save(rapport);
    }

    @Override
    @Transactional
    public Rapport updateRapport(Long id, Rapport updatedRapport) {
        Rapport rapport = rapportRepository.findById(id)
            .orElseThrow(() -> new ResourceNotFoundException("Rapport non trouvé avec l'ID : " + id));

        rapport.setDetails(updatedRapport.getDetails());
        rapport.setDateRapport(updatedRapport.getDateRapport());

        return rapportRepository.save(rapport);
    }

    @Override
    @Transactional
    public void deleteRapport(Long id) {
        if (!rapportRepository.existsById(id)) {
            throw new ResourceNotFoundException("Rapport non trouvé avec l'ID : " + id);
        }
        rapportRepository.deleteById(id);
    }
} 