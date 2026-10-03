package com.redabensaad.vitassure.Repository;

import com.redabensaad.vitassure.Entity.PriseEnCharge;
import com.redabensaad.vitassure.Enum.StatutPriseEnCharge;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface PriseEnChargeRepository extends JpaRepository<PriseEnCharge, Long> {
    List<PriseEnCharge> findByUtilisateurId(Long utilisateurId);
    List<PriseEnCharge> findByStatut(StatutPriseEnCharge statut);
} 