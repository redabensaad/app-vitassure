package com.redabensaad.vitassure.Repository;

import com.redabensaad.vitassure.Entity.Rapport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RapportRepository extends JpaRepository<Rapport, Long> {
    List<Rapport> findByDossierId(Long dossierId);
} 