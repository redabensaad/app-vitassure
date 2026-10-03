package com.redabensaad.vitassure.Service.Interface;

import com.redabensaad.vitassure.Entity.PriseEnCharge;
import com.redabensaad.vitassure.Enum.StatutPriseEnCharge;
import java.util.List;
import java.util.Optional;

public interface IPriseEnChargeService {
    List<PriseEnCharge> getAllPrisesEnCharge();
    Optional<PriseEnCharge> getPriseEnChargeById(Long id);
    List<PriseEnCharge> getPriseEnChargeByUtilisateur(Long utilisateurId);
    List<PriseEnCharge> getPriseEnChargeByStatut(StatutPriseEnCharge statut);
    PriseEnCharge savePriseEnCharge(PriseEnCharge priseEnCharge);
    PriseEnCharge updatePriseEnCharge(Long id, PriseEnCharge priseEnCharge);
    void deletePriseEnCharge(Long id);
    PriseEnCharge rejeterPriseEnCharge(Long id);
    PriseEnCharge accepterPriseEnCharge(Long id);
} 