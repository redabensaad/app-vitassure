package com.redabensaad.vitassure.DTO.request;

import com.redabensaad.vitassure.Enum.StatutPriseEnCharge;
import lombok.Data;
import java.time.LocalDate;

@Data
public class PriseEnChargeRequestDTO {
    private Long utilisateurId;
    private String description;
    private Double montantEstime;
    private LocalDate dateDemande;
    private StatutPriseEnCharge statut;
    private String commentaire;
} 